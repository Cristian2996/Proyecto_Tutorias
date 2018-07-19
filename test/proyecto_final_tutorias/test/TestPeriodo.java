/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_final_tutorias.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import proyecto_final_tutorias.dao.IPeriodo;
import proyecto_final_tutorias.entidades.Periodo;
import proyecto_final_tutorias.impl.PeriodoImpl;
/**
 *
 * @author CRISTIAN
 */
public class TestPeriodo {

    public TestPeriodo() {
    }
    @Test
     public void pruebageneral() throws Exception{
        boolean filasAfectadas = false;
        IPeriodo periodoDao = new PeriodoImpl();
        Periodo periodo = new Periodo("Monica",new Date(),new Date(),2,"ABRIL 2017 - AGOSTO 2017",202,1);
        try{
            filasAfectadas = periodoDao.insertar(periodo);
            System.out.println("Periodo ingresado!!!\n");
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
        assertTrue(filasAfectadas != false);
        
        Periodo periodoo=new Periodo();
        try {
            periodoo= periodoDao.obtener(1);
            System.out.println("Nombre :"+periodoo.getNombre());
            System.out.println("Fecha inicio :"+periodoo.getFecha_inicio());
            System.out.println("Fecha fin :"+periodoo.getFecha_fin());
            System.out.println("Tipo :"+periodoo.getTipo());
            System.out.println("Observaciones :"+periodoo.getObservaciones());
            System.out.println("Codigo sicoa :"+periodoo.getCodigo_sicoa());
            System.out.println("Estado :"+periodoo.getEstado());
                        
        } catch (Exception e) {
        }

        List<Periodo> lista = new ArrayList<>();
        try {
            lista = periodoDao.obtener();
            for (Periodo c:lista){
            System.out.println("Datos Producto");
            System.out.println("Nombre :"+periodoo.getNombre());
            System.out.println("Fecha inicio :"+periodoo.getFecha_inicio());
            System.out.println("Fecha fin :"+periodoo.getFecha_fin());
            System.out.println("Tipo :"+periodoo.getTipo());
            System.out.println("Observaciones :"+periodoo.getObservaciones());
            System.out.println("Codigo sicoa :"+periodoo.getCodigo_sicoa());
            System.out.println("Estado :"+periodoo.getEstado());
            
            }
        } catch (Exception e) {
            System.out.println("Error:" + e.getMessage());
        }
        assertTrue(lista.size()>0);
    }   
}
