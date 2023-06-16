package edu.pe.upc.proyectofinal.repositories;

import edu.pe.upc.proyectofinal.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IClienteRepository  extends JpaRepository<Cliente,Integer> {
}
