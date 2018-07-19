package proyecto_final_tutorias.test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import proyecto_final_tutorias.dao.IModalidad_Tutoria;
import proyecto_final_tutorias.entidades.Modalidad_tutoria;
import proyecto_final_tutorias.impl.Modalidad_tutoriaImpl;

/**
 *
 * @author CRISTIAN
 */
public class TestModalidad_tutoria {

    public TestModalidad_tutoria() {
    }
     @Test
     public void pruebageneral() throws Exception{
        boolean filasAfectadas = false;
        IModalidad_Tutoria modalidad_tutoriaDao = new Modalidad_tutoriaImpl();
        Modalidad_tutoria modalidad_tutoria = new Modalidad_tutoria("Monica","Ninguno",1);
        try{
            filasAfectadas = modalidad_tutoriaDao.insertar(modalidad_tutoria);
            System.out.println("Modalidad ingresado!!!\n");
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
        assertTrue(filasAfectadas != false);
        
        Modalidad_tutoria modalidad_tutoriaa=new Modalidad_tutoria();
        try {
            modalidad_tutoriaa= modalidad_tutoriaDao.obtener(1);
            System.out.println("Nombre :"+modalidad_tutoriaa.getNombre());
            System.out.println("Observacion :"+modalidad_tutoriaa.getDescripcion());
            System.out.println("Estado :"+modalidad_tutoriaa.getEstado());
                        
        } catch (Exception e) {
        }

        List<Modalidad_tutoria> lista = new ArrayList<>();
        try {
            lista = modalidad_tutoriaDao.obtener();
            for (Modalidad_tutoria c:lista){
            System.out.println("Datos Producto");
            System.out.println("Nombre :"+modalidad_tutoriaa.getNombre());
            System.out.println("Apellido :"+modalidad_tutoriaa.getDescripcion());
            System.out.println("Cedula :"+modalidad_tutoriaa.getEstado());
            
            }
        } catch (Exception e) {
            System.out.println("Error:" + e.getMessage());
        }
        assertTrue(lista.size()>0);
    }   
}
