package edu.pe.upc.proyectofinal.servicesimplement;

import edu.pe.upc.proyectofinal.entities.Cliente;
import edu.pe.upc.proyectofinal.repositories.IClienteRepository;
import edu.pe.upc.proyectofinal.services.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ClienteServiceImplement implements IClienteService {

    @Autowired
    private IClienteRepository cR;
    @Override
    public void insert(Cliente cliente) {
        cR.save(cliente);
    }

    @Override
    public List<Cliente> list() {
        return cR.findAll();
    }

    @Override
    public void delete(int idC) {
    cR.deleteById(idC);
    }

    @Override
    public Cliente listId(int idC) {
        return cR.findById(idC).orElse(new Cliente());
    }
}
