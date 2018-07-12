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
public class Modalidad_tutoria {
    private int codigo_MT;
    private String nombre;
    private String descripcion;
    private int estado;

    public Modalidad_tutoria() {
    }

    public Modalidad_tutoria(int codigo_MT, String nombre, String descripcion, int estado) {
        this.codigo_MT = codigo_MT;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getCodigo_MT() {
        return codigo_MT;
    }

    public void setCodigo_MT(int codigo_MT) {
        this.codigo_MT = codigo_MT;
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
