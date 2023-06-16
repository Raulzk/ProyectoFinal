package edu.pe.upc.proyectofinal.controllers;

import edu.pe.upc.proyectofinal.dtos.CotizarDTO;
import edu.pe.upc.proyectofinal.dtos.TrabajadorDTO;
import edu.pe.upc.proyectofinal.entities.Trabajador;
import edu.pe.upc.proyectofinal.services.ITrabajadorService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/trabajadores")
public class TrabajadorController {
    @Autowired
    private ITrabajadorService aS;
    @PostMapping
    public void insert(@RequestBody TrabajadorDTO dto) {

        ModelMapper m = new ModelMapper();
        Trabajador t = m.map(dto, Trabajador.class);
        aS.insert(t);
    }

    @GetMapping
    public List<TrabajadorDTO> list() {
        return aS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,TrabajadorDTO.class);

        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){
    aS.delete(id);
    }

    @GetMapping("/{id}")
    public TrabajadorDTO list(@PathVariable("id") Integer id){
        ModelMapper m= new ModelMapper();
        TrabajadorDTO dto=m.map(aS.listId(id),TrabajadorDTO.class);

        return dto;
    }

    @PutMapping
    public void goUpdate(@RequestBody TrabajadorDTO dto){
        ModelMapper m = new ModelMapper();
        Trabajador t = m.map(dto, Trabajador.class);
        aS.insert(t);
    }

}
