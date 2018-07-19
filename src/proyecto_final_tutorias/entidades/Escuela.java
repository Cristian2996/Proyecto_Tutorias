/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_final_tutorias.entidades;

/**
 *
 * @author CRISTIAN
 */
public class Escuela {
    private Facultad facultad;
    private String nombre;
    private String descripcion;
    private int codigo_sicoa;

    public Escuela() {
    }

    public Escuela(Facultad facultad, String nombre, String descripcion, int codigo_sicoa) {
        this.facultad = facultad;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.codigo_sicoa = codigo_sicoa;
    }

    public int getCodigo_sicoa() {
        return codigo_sicoa;
    }

    public void setCodigo_sicoa(int codigo_sicoa) {
        this.codigo_sicoa = codigo_sicoa;
    }

    public Facultad getFacultad() {
        return facultad;
    }

    public void setFacultad(Facultad facultad) {
        this.facultad = facultad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
