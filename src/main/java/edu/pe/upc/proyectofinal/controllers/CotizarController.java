package edu.pe.upc.proyectofinal.controllers;

import edu.pe.upc.proyectofinal.dtos.CotizarDTO;
import edu.pe.upc.proyectofinal.entities.Cotizar;
import edu.pe.upc.proyectofinal.services.ICotizarService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/cotizars")
public class CotizarController {
    @Autowired
    private ICotizarService nS;
    @PostMapping
    public void insert(@RequestBody CotizarDTO dto) {

        ModelMapper m = new ModelMapper();
        Cotizar t = m.map(dto, Cotizar.class);
        nS.insert(t);
    }
    @GetMapping
    public List<CotizarDTO> list() {
        return nS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,CotizarDTO.class);

        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){nS.delete(id);
    }
    @GetMapping("/{id}")
    public CotizarDTO list(@PathVariable("id") Integer id){
        ModelMapper m= new ModelMapper();
        CotizarDTO dto=m.map(nS.listId(id),CotizarDTO.class);

        return dto;
    }

    @PutMapping
    public void goUpdate(@RequestBody CotizarDTO dto){
        ModelMapper m = new ModelMapper();
        Cotizar t = m.map(dto, Cotizar.class);
        nS.insert(t);
    }
}
