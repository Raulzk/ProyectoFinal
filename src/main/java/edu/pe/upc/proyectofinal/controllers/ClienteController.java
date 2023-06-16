package edu.pe.upc.proyectofinal.controllers;

import edu.pe.upc.proyectofinal.dtos.ClienteDTO;
import edu.pe.upc.proyectofinal.dtos.TrabajadorDTO;
import edu.pe.upc.proyectofinal.entities.Cliente;
import edu.pe.upc.proyectofinal.entities.Trabajador;
import edu.pe.upc.proyectofinal.services.IClienteService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    @Autowired
    private IClienteService iCS;
    @PostMapping
    public void insert(@RequestBody ClienteDTO dto) {

        ModelMapper m = new ModelMapper();
        Cliente t = m.map(dto, Cliente.class);
        iCS.insert(t);
    }
    @GetMapping
    public List<ClienteDTO> list() {
        return iCS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,ClienteDTO.class);

        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){iCS.delete(id);
    }
    @GetMapping("/{id}")
    public ClienteDTO list(@PathVariable("id") Integer id){
        ModelMapper m= new ModelMapper();
        ClienteDTO dto=m.map(iCS.listId(id),ClienteDTO.class);

        return dto;
    }

    @PutMapping
    public void goUpdate(@RequestBody ClienteDTO dto){
        ModelMapper m = new ModelMapper();
        Cliente t = m.map(dto, Cliente.class);
        iCS.insert(t);
    }

}
