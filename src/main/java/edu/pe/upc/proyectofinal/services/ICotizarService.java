package edu.pe.upc.proyectofinal.services;

import edu.pe.upc.proyectofinal.dtos.CotizarDTO;
import edu.pe.upc.proyectofinal.dtos.CotizarTrabajadorDTO;
import edu.pe.upc.proyectofinal.entities.Cliente;
import edu.pe.upc.proyectofinal.entities.Cotizar;

import java.util.List;

public interface ICotizarService {
    public void insert(Cotizar cotizar);
    List<Cotizar> list();
    public void delete(int idC);

    public Cotizar listId(int idC);
    public List<CotizarTrabajadorDTO> reporte01();
}
