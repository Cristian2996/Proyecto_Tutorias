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
public class Facultad {
    private String nombre;
    private String descripcion;
    private int codigo_sicoa;

    public Facultad() {
    }

    public Facultad(String nombre, String descripcion, int codigo_sicoa) {
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
