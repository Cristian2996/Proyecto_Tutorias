/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_final_tutorias.dao;
import java.util.ArrayList;
import java.util.List;
import proyecto_final_tutorias.entidades.Nivel;

/**
 *
 * @author CRISTIAN
 */
public interface INivel {
    public boolean insertar (Nivel nivel)throws Exception;
    public boolean modificar (Nivel nivel)throws Exception;
    public boolean eliminar (Nivel nivel)throws Exception;
    public Nivel obtener (int codigo_N)throws Exception;
    public List<Nivel> obtener() throws Exception;
}
