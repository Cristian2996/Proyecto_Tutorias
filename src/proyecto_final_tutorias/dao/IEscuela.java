/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_final_tutorias.dao;
import java.util.ArrayList;
import java.util.List;
import proyecto_final_tutorias.entidades.Escuela;

/**
 *
 * @author CRISTIAN
 */
public interface IEscuela {
    public boolean insertar (Escuela escuela)throws Exception;
    public boolean modificar (Escuela escuela)throws Exception;
    public boolean eliminar (Escuela escuela)throws Exception;
    public Escuela obtener (int codigo_Es)throws Exception;
    public List<Escuela> obtener() throws Exception; 
}
