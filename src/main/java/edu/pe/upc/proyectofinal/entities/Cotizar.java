package edu.pe.upc.proyectofinal.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="cotizars")
public class Cotizar {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "direccion",length = 60,nullable = false)
    private String direccion;
    @Column(name = "imagen", nullable = false)
    private String imagen;
    @Column(name = "discripcion", nullable = false)
    private String discripcion;
    @Column(name = "fechaServicio")
    private LocalDate fechaServicio;
    @ManyToOne
    @JoinColumn(name="idTrabajador")
    private Trabajador trabajador;

    public Cotizar() {
    }

    public Cotizar(int id, String direccion, String imagen, String discripcion, LocalDate fechaServicio, Trabajador trabajador) {
        this.id = id;
        this.direccion = direccion;
        this.imagen = imagen;
        this.discripcion = discripcion;
        this.fechaServicio = fechaServicio;
        this.trabajador = trabajador;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getDiscripcion() {
        return discripcion;
    }

    public void setDiscripcion(String discripcion) {
        this.discripcion = discripcion;
    }

    public LocalDate getFechaServicio() {
        return fechaServicio;
    }

    public void setFechaServicio(LocalDate fechaServicio) {
        this.fechaServicio = fechaServicio;
    }

    public Trabajador getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(Trabajador trabajador) {
        this.trabajador = trabajador;
    }
}
