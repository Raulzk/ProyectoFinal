package edu.pe.upc.proyectofinal.entities;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Table(name="clientes")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="nombre",length = 60,nullable = false)
    private String nombre;
    @Column(name="dni",length = 10,nullable = false)
    private String dni;
    @Column(name="correo",length = 60,nullable = false)
    private String correo;
    @Column(name="sexo",length = 60,nullable = false)
    private  String sexo;
    @Column(name="direccion",length = 60,nullable = false)
    private  String direccion;
    @Column(name="telefono",length = 10,nullable = false)
    private int telefono;
    @Column(name="fechaNacimiento")
    private LocalDate fechaNacimiento;
    @Column(name="FechaRegistro")
    private LocalDate FechaRegistro;

    public Cliente() {

    }

    public Cliente(int id, String nombre, String dni, String correo, String sexo, String direccion, int telefono, LocalDate fechaNacimiento, LocalDate fechaRegistro) {
        this.id = id;
        this.nombre = nombre;
        this.dni = dni;
        this.correo = correo;
        this.sexo = sexo;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        FechaRegistro = fechaRegistro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public LocalDate getFechaRegistro() {
        return FechaRegistro;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        FechaRegistro = fechaRegistro;
    }
}
