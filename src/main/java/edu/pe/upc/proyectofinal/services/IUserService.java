package edu.pe.upc.proyectofinal.services;

import edu.pe.upc.proyectofinal.entities.Users;

import java.util.List;

public interface IUserService {
    public Integer insert(Users user);

    List<Users> list();
}
