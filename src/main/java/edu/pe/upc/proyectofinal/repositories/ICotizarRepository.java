package edu.pe.upc.proyectofinal.repositories;

import edu.pe.upc.proyectofinal.entities.Cotizar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ICotizarRepository extends JpaRepository<Cotizar,Integer> {
    @Query(value = "SELECT t.nombre_completo,count(c.id) from cotizars c \n" +
            " join trabajadores t on  c.id = t.id\n" +
            " group by t.nombre_completo ORDER BY COUNT(t.nombre_completo) DESC\n" +
            " limit 1", nativeQuery = true)

    List<String[]> getCountCotizarsTrabajadores();
}
