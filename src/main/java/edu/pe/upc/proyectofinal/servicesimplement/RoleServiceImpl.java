package edu.pe.upc.proyectofinal.servicesimplement;

import edu.pe.upc.proyectofinal.entities.Role;
import edu.pe.upc.proyectofinal.repositories.RoleRepository;
import edu.pe.upc.proyectofinal.services.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RoleServiceImpl  implements IRoleService {
    @Autowired
    private RoleRepository rR;
    @Override
    public void insert(Role role) {
        rR.save(role);
    }

    @Override
    public List<Role> list() {
        // TODO Auto-generated method stub
        return rR.findAll();
    }
}
