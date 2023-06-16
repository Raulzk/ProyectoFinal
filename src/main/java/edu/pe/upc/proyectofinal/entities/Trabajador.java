package edu.pe.upc.proyectofinal.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="trabajadores")

public class Trabajador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "nombreCompleto",length = 60,nullable = false)
   private String nombreCompleto;
    @Column(name = "telefono",length = 9,nullable = false)
   private int telefono;
    @Column(name = "correo",length = 60,nullable = false)
   private String correo;
    @Column(name = "sexo",length = 60,nullable = false)
   private String sexo;
    @Column(name = "dni",length = 60,nullable = false)
   private String dni;
    @Column(name = "direccion",length = 60,nullable = false)
    private String direccion;
    @Column(name = "servicio",length = 60,nullable = false)
    private String servicio;
    @Column(name = "fechaNacimiento")
    private LocalDate fechaNacimiento;
    @Column(name = "fechaIngreso")
    private LocalDate fechaIngreso;

    public Trabajador() {
    }

    public Trabajador(int id, String nombreCompleto, int telefono, String correo, String sexo, String dni, String direccion, String servicio, LocalDate fechaNacimiento, LocalDate fechaIngreso) {
        this.id = id;
        this.nombreCompleto = nombreCompleto;
        this.telefono = telefono;
        this.correo = correo;
        this.sexo = sexo;
        this.dni = dni;
        this.direccion = direccion;
        this.servicio = servicio;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaIngreso = fechaIngreso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
}
