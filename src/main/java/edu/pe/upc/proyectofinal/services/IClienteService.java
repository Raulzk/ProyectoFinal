package edu.pe.upc.proyectofinal.services;

import edu.pe.upc.proyectofinal.entities.Cliente;
import edu.pe.upc.proyectofinal.entities.Trabajador;

import java.util.List;

public interface IClienteService {


    public void insert(Cliente cliente);
    List<Cliente> list();
    public void delete(int idC);

    public Cliente listId(int idC);
}
