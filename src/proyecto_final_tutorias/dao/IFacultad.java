/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_final_tutorias.dao;
import java.util.ArrayList;
import java.util.List;
import proyecto_final_tutorias.entidades.Facultad;

/**
 *
 * @author CRISTIAN
 */
public interface IFacultad {
    public boolean insertar (Facultad facultad)throws Exception;
    public boolean modificar (Facultad facultad)throws Exception;
    public boolean eliminar (Facultad facultad)throws Exception;
    public Facultad obtener (int codigo_F)throws Exception;
    public List<Facultad> obtener() throws Exception; 
}
