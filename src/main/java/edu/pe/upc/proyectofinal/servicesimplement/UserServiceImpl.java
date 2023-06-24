package edu.pe.upc.proyectofinal.servicesimplement;

import edu.pe.upc.proyectofinal.entities.Users;
import edu.pe.upc.proyectofinal.repositories.UserRepository;
import edu.pe.upc.proyectofinal.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserRepository uR;

    @Override
    public Integer insert(Users user) {
        int rpta = uR.buscarUsername(user.getUsername());
        if (rpta == 0) {
            uR.save(user);
        }
        return rpta;
    }

    @Override
    public List<Users> list() {
        // TODO Auto-generated method stub
        return uR.findAll();
    }
}
