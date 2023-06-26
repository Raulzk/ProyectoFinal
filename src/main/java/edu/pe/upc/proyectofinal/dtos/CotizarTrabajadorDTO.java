package edu.pe.upc.proyectofinal.dtos;

public class CotizarTrabajadorDTO {
    private String nameTrabajador;
    private int bookSoli;

    public CotizarTrabajadorDTO() {
    }

    public CotizarTrabajadorDTO(String nameTrabajador, int bookSoli) {
        this.nameTrabajador = nameTrabajador;
        this.bookSoli = bookSoli;

    }

    public String getNameTrabajador() {
        return nameTrabajador;
    }

    public void setNameTrabajador(String nameTrabajador) {
        this.nameTrabajador = nameTrabajador;
    }

    public int getBookSoli() {
        return bookSoli;
    }

    public void setBookSoli(int bookSoli) {
        this.bookSoli = bookSoli;
    }
}
