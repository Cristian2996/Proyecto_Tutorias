/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_final_tutorias.dao;
import java.util.ArrayList;
import java.util.List;
import proyecto_final_tutorias.entidades.Estudiante;

/**
 *
 * @author CRISTIAN
 */
public interface IEstudiante {
    public boolean insertar (Estudiante estudiante)throws Exception;
    public boolean modificar (Estudiante estudiante)throws Exception;
    public boolean eliminar (Estudiante estudiante)throws Exception;
    public Estudiante obtener (int codigo_E)throws Exception;
    public List<Estudiante> obtener() throws Exception; 
}
