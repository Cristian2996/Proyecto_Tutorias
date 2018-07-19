/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_final_tutorias.dao;
import java.util.ArrayList;
import java.util.List;
import proyecto_final_tutorias.entidades.Ambito;

/**
 *
 * @author CRISTIAN
 */
public interface IAmbito {
    public boolean insertar (Ambito ambito)throws Exception;
    public boolean modificar (Ambito ambito)throws Exception;
    public boolean eliminar (Ambito ambito)throws Exception;
    public Ambito obtener (int codigo_A)throws Exception;
    public List<Ambito> obtener() throws Exception; 
}
