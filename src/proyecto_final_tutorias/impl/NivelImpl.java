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
import proyecto_final_tutorias.dao.INivel;
import proyecto_final_tutorias.entidades.Nivel;

/**
 *
 * @author CRISTIAN
 */
public class NivelImpl implements INivel {

    @Override
    public boolean insertar(Nivel nivel) throws Exception {
        boolean eje = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from master.f_insert_facultad(?,?,?,?)";
            lstP.add(new Parametro(1, nivel.getCodigo_N()));
            lstP.add(new Parametro(2, nivel.getCodigo_sicoa()));
            lstP.add(new Parametro(3, nivel.getNombre()));
            lstP.add(new Parametro(4, nivel.getParalelo()));
            lstP.add(new Parametro(5, nivel.getModalidad()));
            lstP.add(new Parametro(6, nivel.getCodigo_escuela()));
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
     public static ArrayList<Nivel> llenarNiveles(ConjuntoResultado rs) throws Exception {
        ArrayList<Nivel> lst = new ArrayList<Nivel>();
        Nivel nivel = null;
        try {
            while (rs.next()) {
                nivel = new Nivel(rs.getInt("pcodigo"), rs.getInt("pcodigo_sicoa"), rs.getString("pnombre"), rs.getString("pparalelo")
                , rs.getString("pmodalidad"), rs.getInt("pcodigo_escuela"));
                lst.add(nivel);
            }
        } catch (Exception e) {
            lst.clear();
            throw e;
        }
        return lst;
    }

    @Override
    public boolean modificar(Nivel nivel) throws Exception {
       boolean eje = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from master.f_update_facultad(?,?,?,?)";
            lstP.add(new Parametro(1, nivel.getCodigo_sicoa()));
            lstP.add(new Parametro(2, nivel.getNombre()));
            lstP.add(new Parametro(3, nivel.getParalelo()));
            lstP.add(new Parametro(4, nivel.getModalidad()));
            lstP.add(new Parametro(5, nivel.getCodigo_escuela()));
            lstP.add(new Parametro(6, nivel.getCodigo_N()));
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

    @Override
    public boolean eliminar(Nivel nivel) throws Exception {
         boolean eje = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from master.f_delete_facultad(?)";
            lstP.add(new Parametro(1, nivel.getCodigo_N()));
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

    @Override
    public Nivel obtener(int codigo_N) throws Exception {
         Nivel lst;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from master.f_select_facultad_dado_codigo(?)";
            lstP.add(new Parametro(1, codigo_N));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = new Nivel();
            lst = llenarNiveles(rs).get(0);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    @Override
    public List<Nivel> obtener() throws Exception {
        ArrayList<Nivel> lst = new ArrayList<Nivel>();
        try {
            String sql = "select * from master.f_select_facultad()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarNiveles(rs);
            rs = null;

        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
}
