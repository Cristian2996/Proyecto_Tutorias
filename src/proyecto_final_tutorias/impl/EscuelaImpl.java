/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_final_tutorias.impl;

import accesodatos.AccesoDatos;
import accesodatos.ConjuntoResultado;
import accesodatos.Parametro;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import proyecto_final_tutorias.dao.IEscuela;
import proyecto_final_tutorias.entidades.Escuela;

/**
 *
 * @author CRISTIAN
 */
public class EscuelaImpl implements IEscuela{

    @Override
    public boolean insertar(Escuela escuela) throws Exception {
      boolean eje = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from actividades.fninsertar_modalidad_tutoria(?,?,?)";
            lstP.add(new Parametro(1, escuela.getFacultad().getCodigo_F()));
            lstP.add(new Parametro(2, escuela.getNombre()));
            lstP.add(new Parametro(3, escuela.getDescripcion()));
            lstP.add(new Parametro(4, escuela.getCodigo_sicoa()));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            while (rs.next()) {
                if (rs.getString(0).equals("true"));
                eje = true;
            }
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return eje;
    }

    public static ArrayList<Escuela> llenarModalidad_tutorias(ConjuntoResultado rs) throws Exception {
        ArrayList<Escuela> lst = new ArrayList<Escuela>();
        Escuela escuela = null;
        try {
            while (rs.next()) {
                escuela = new Escuela(rs.getString("pnombre"), rs.getString("pdescripcion"), rs.getInt("pestado"));
                lst.add(escuela);
            }
        } catch (Exception e) {
            lst.clear();
            throw e;
        }
        return lst;
    }

    @Override
    public boolean modificar(Escuela escuela) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminar(Escuela escuela) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Escuela obtener(int codigo_Es) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Escuela> obtener() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
