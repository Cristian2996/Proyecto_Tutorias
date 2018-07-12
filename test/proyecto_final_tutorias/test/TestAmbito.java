/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_final_tutorias.test;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import proyecto_final_tutorias.dao.IAmbito;
import proyecto_final_tutorias.entidades.Ambito;
import proyecto_final_tutorias.impl.AmbitoImpl;
/**
 *
 * @author CRISTIAN
 */
public class TestAmbito {

    public TestAmbito() {
    }
   @Test
    public void pruebageneral() throws Exception{
        int filasAfectadas = 0;
        IAmbito ambitoDao = new AmbitoImpl();
        Ambito ambito = new Ambito(21,"Juan","-",1);
        try{
            filasAfectadas = ambitoDao.insertar(ambito);
            System.out.println("Ambito ingresado!!!\n");
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
        assertEquals(filasAfectadas>0, true);
        
        Ambito ambitoo=new Ambito();
        try {
            ambitoo=ambitoDao.obtener(1);
            System.out.println("Codigo  :"+ambitoo.getCodigo_A());
            System.out.println("Nombre :"+ambitoo.getNombre());
            System.out.println("Observacion :"+ambitoo.getObservacion());
            System.out.println("Estado :"+ambitoo.getEstado());
                        
        } catch (Exception e) {
        }

        List<Ambito> lista = new ArrayList<>();
        try {
            lista = ambitoDao.obtener();
            for (Ambito c:lista){
            System.out.println("Datos Producto");
            System.out.println("Codigo  :"+ambitoo.getCodigo_A());
            System.out.println("Nombre :"+ambitoo.getNombre());
            System.out.println("Apellido :"+ambitoo.getObservacion());
            System.out.println("Cedula :"+ambitoo.getEstado());
            
            }
        } catch (Exception e) {
            System.out.println("Error:" + e.getMessage());
        }
        assertTrue(lista.size()>0);
    }   
}

