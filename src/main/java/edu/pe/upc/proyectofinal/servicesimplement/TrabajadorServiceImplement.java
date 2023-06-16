package edu.pe.upc.proyectofinal.servicesimplement;

import edu.pe.upc.proyectofinal.entities.Trabajador;
import edu.pe.upc.proyectofinal.repositories.ITrabajadorRepository;
import edu.pe.upc.proyectofinal.services.ITrabajadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TrabajadorServiceImplement implements ITrabajadorService {

    @Autowired
    private ITrabajadorRepository aR;

    @Override
    public void insert(Trabajador trabajador) {
        aR.save(trabajador);
    }

    @Override
    public List<Trabajador> list() {
        return aR.findAll();
    }

    @Override
    public void delete(int idTrabajador) {
        aR.deleteById(idTrabajador);
    }

    @Override
    public Trabajador listId(int idTrabajador) {
        return aR.findById(idTrabajador).orElse(new Trabajador());
    }

}
