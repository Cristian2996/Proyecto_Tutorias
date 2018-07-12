/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_final_tutorias.dao;
import java.util.ArrayList;
import java.util.List;
import proyecto_final_tutorias.entidades.Modalidad_tutoria;

/**
 *
 * @author CRISTIAN
 */
public interface IModalidad_Tutoria {
    public boolean insertar (Modalidad_tutoria modalidad_tutoria)throws Exception;
    public boolean modificar (Modalidad_tutoria modalidad_tutoria)throws Exception;
    public boolean eliminar (Modalidad_tutoria modalidad_tutoria)throws Exception;
    public Modalidad_tutoria obtener (int codigo_MT)throws Exception;
    public List<Modalidad_tutoria> obtener() throws Exception;
}
