/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_final_tutorias.entidades;

public class Estudiante {
    private int codigo_E;
    private String nombre;
    private String apellido;
    private String cedula;
    private int codigo_sicoa;
    private Periodo periodo;
    private Nivel nivel;

    public Estudiante() {
    }

    public Estudiante(int codigo_E, String nombre, String apellido, String cedula, int codigo_sicoa, Periodo periodo, Nivel nivel) {
        this.codigo_E = codigo_E;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.codigo_sicoa = codigo_sicoa;
        this.periodo = periodo;
        this.nivel = nivel;
    }

    public Nivel getNivel() {
        return nivel;
    }

    public void setNivel(Nivel nivel) {
        this.nivel = nivel;
    }

    public int getCodigo_E() {
        return codigo_E;
    }

    public void setCodigo_E(int codigo_E) {
        this.codigo_E = codigo_E;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getCodigo_sicoa() {
        return codigo_sicoa;
    }

    public void setCodigo_sicoa(int codigo_sicoa) {
        this.codigo_sicoa = codigo_sicoa;
    }

    public Periodo getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Periodo periodo) {
        this.periodo = periodo;
    }
    
    
}
