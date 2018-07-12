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
public class Nivel {
    private int codigo_N;
    private int codigo_sicoa;
    private String nombre;
    private String paralelo;
    private String modalidad;
    private int codigo_escuela;

    public Nivel() {
    }

    public Nivel(int codigo_N, int codigo_sicoa, String nombre, String paralelo, String modalidad, int codigo_escuela) {
        this.codigo_N = codigo_N;
        this.codigo_sicoa = codigo_sicoa;
        this.nombre = nombre;
        this.paralelo = paralelo;
        this.modalidad = modalidad;
        this.codigo_escuela = codigo_escuela;
    }

    public int getCodigo_escuela() {
        return codigo_escuela;
    }

    public void setCodigo_escuela(int codigo_escuela) {
        this.codigo_escuela = codigo_escuela;
    }

    public int getCodigo_N() {
        return codigo_N;
    }

    public void setCodigo_N(int codigo_N) {
        this.codigo_N = codigo_N;
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

    public String getParalelo() {
        return paralelo;
    }

    public void setParalelo(String paralelo) {
        this.paralelo = paralelo;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }
    
}
