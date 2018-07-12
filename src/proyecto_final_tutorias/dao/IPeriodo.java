/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_final_tutorias.dao;
import java.util.ArrayList;
import java.util.List;
import proyecto_final_tutorias.entidades.Periodo;

/**
 *
 * @author CRISTIAN
 */
public interface IPeriodo {
    public boolean insertar (Periodo periodo)throws Exception;
    public boolean modificar (Periodo periodo)throws Exception;
    public boolean eliminar (Periodo periodo)throws Exception;
    public Periodo obtener (int codigo_P)throws Exception;
    public List<Periodo> obtener() throws Exception;
}
