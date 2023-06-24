package edu.pe.upc.proyectofinal.services;

import edu.pe.upc.proyectofinal.entities.Role;

import java.util.List;

public interface IRoleService {
    public void insert(Role role);

    List<Role> list();
}
