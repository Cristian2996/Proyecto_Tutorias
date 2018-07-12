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
public class Ambito {
 private int codigo_A;
 private String nombre;
 private String observacion;
 private int estado;

    public Ambito() {
    }

    public Ambito(int codigo_A, String nombre, String observacion, int estado) {
        this.codigo_A = codigo_A;
        this.nombre = nombre;
        this.observacion = observacion;
        this.estado = estado;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getCodigo_A() {
        return codigo_A;
    }

    public void setCodigo_A(int codigo_A) {
        this.codigo_A = codigo_A;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
 
}
