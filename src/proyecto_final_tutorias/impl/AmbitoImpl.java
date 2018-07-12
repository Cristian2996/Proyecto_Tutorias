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
import proyecto_final_tutorias.dao.IAmbito;
import proyecto_final_tutorias.entidades.Ambito;

/**
 *
 * @author CRISTIAN
 */
public class AmbitoImpl implements IAmbito {

    @Override
    public int insertar(Ambito ambito) throws Exception {
            int eje = 0;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from actividades.fn_obtener_datos_ambito(?,?,?,?)";
            lstP.add(new Parametro(1, ambito.getCodigo_A()));
            lstP.add(new Parametro(2, ambito.getNombre()));
            lstP.add(new Parametro(3, ambito.getObservacion()));
            lstP.add(new Parametro(4, ambito.getEstado()));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            while (rs.next()) {
                if (rs.getString(0).equals("true"));
                eje = 1;
            }
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return eje;
    }
    public static ArrayList<Ambito> llenarAmbitos(ConjuntoResultado rs) throws Exception {
        ArrayList<Ambito> lst = new ArrayList<Ambito>();
        Ambito ambito = null;
        try {
            while (rs.next()) {
                ambito = new Ambito(rs.getInt("pcodigo"), rs.getString("pnombre"), rs.getString("pobservacion"), rs.getInt("pestado"));
                lst.add(ambito);
            }
        } catch (Exception e) {
            lst.clear();
            throw e;
        }
        return lst;
    }
    @Override
    public int modificar(Ambito ambito) throws Exception {
    int eje = 0;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from actividades.fnactualizar_ambito(?,?,?,?)";
            lstP.add(new Parametro(1, ambito.getNombre()));
            lstP.add(new Parametro(2, ambito.getObservacion()));
            lstP.add(new Parametro(3, ambito.getEstado()));
            lstP.add(new Parametro(4, ambito.getCodigo_A()));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            while (rs.next()) {
                if (rs.getString(0).equals("true"));
                eje = 1;
            }
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return eje;    
    }

    @Override
    public int eliminar(Ambito ambito) throws Exception {
        int eje = 0;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from actividades.fneliminar_ambito(?)";
            lstP.add(new Parametro(1, ambito.getCodigo_A()));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            while (rs.next()) {
                if (rs.getString(0).equals("true"));
                eje = 1;
            }
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return eje;   
    }

    @Override
    public Ambito obtener(int codigo_A) throws Exception {
         Ambito lst;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from actividades.fn_obtener_tipo_ambito_dado_codigo(?)";
            lstP.add(new Parametro(1, codigo_A));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = new Ambito();
            lst = llenarAmbitos(rs).get(0);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    @Override
    public List<Ambito> obtener() throws Exception {
           ArrayList<Ambito> lst = new ArrayList<Ambito>();
        try {
            String sql = "select * fromactividades.fn_obtener_datos_ambito()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarAmbitos(rs);
            rs = null;

        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
}
