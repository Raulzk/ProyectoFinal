package edu.pe.upc.proyectofinal.servicesimplement;

import edu.pe.upc.proyectofinal.dtos.CotizarDTO;
import edu.pe.upc.proyectofinal.dtos.CotizarTrabajadorDTO;
import edu.pe.upc.proyectofinal.entities.Cotizar;
import edu.pe.upc.proyectofinal.repositories.ICotizarRepository;
import edu.pe.upc.proyectofinal.services.ICotizarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CotizarServiceImplemente  implements ICotizarService {
    @Autowired
    private ICotizarRepository cnR;

    @Override
    public void insert(Cotizar cotizar) {
      cnR.save(cotizar);
    }

    @Override
    public List<Cotizar> list() {
        return cnR.findAll();
    }

    @Override
    public void delete(int idC) {
      cnR.deleteById(idC);
    }

    @Override
    public Cotizar listId(int idC) {
        return cnR.findById(idC).orElse(new Cotizar());
    }

    @Override
    public List<CotizarTrabajadorDTO> reporte01() {
        List<String[]> CountCotizarsTrabajadores = cnR.getCountCotizarsTrabajadores();
        List<CotizarTrabajadorDTO> cotizarTrabajadors = new ArrayList<>();

        for (String[] data : CountCotizarsTrabajadores) {
            CotizarTrabajadorDTO dto = new CotizarTrabajadorDTO();
            dto.setNameTrabajador(data[0]);
            dto.setBookSoli (Integer.parseInt(data[1]));
            cotizarTrabajadors.add(dto);
        }
        return cotizarTrabajadors;
    }
}
