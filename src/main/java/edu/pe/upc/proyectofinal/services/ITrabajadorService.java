package edu.pe.upc.proyectofinal.services;

import edu.pe.upc.proyectofinal.entities.Trabajador;

import java.util.List;

public interface ITrabajadorService {
    public void insert(Trabajador trabajador);
    List<Trabajador>list();
    public void delete(int idTrabajador);

    public Trabajador listId(int idTrabajador);

}
