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
import proyecto_final_tutorias.dao.IModalidad_Tutoria;
import proyecto_final_tutorias.entidades.Modalidad_tutoria;

/**
 *
 * @author CRISTIAN
 */
public class Modalidad_tutoriaImpl implements IModalidad_Tutoria {

    @Override
    public boolean insertar(Modalidad_tutoria modalidad_tutoria) throws Exception {
        boolean eje = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from master.f_insert_facultad(?,?,?,?)";
            lstP.add(new Parametro(1, modalidad_tutoria.getCodigo_MT()));
            lstP.add(new Parametro(2, modalidad_tutoria.getNombre()));
            lstP.add(new Parametro(3, modalidad_tutoria.getDescripcion()));
            lstP.add(new Parametro(4, modalidad_tutoria.getEstado()));
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

    public static ArrayList<Modalidad_tutoria> llenarModalidad_tutorias(ConjuntoResultado rs) throws Exception {
        ArrayList<Modalidad_tutoria> lst = new ArrayList<Modalidad_tutoria>();
        Modalidad_tutoria modalidad_tutoria = null;
        try {
            while (rs.next()) {
                modalidad_tutoria = new Modalidad_tutoria(rs.getInt("pcodigo"), rs.getString("pnombre"), rs.getString("pdescripcion"), rs.getInt("pestado"));
                lst.add(modalidad_tutoria);
            }
        } catch (Exception e) {
            lst.clear();
            throw e;
        }
        return lst;
    }

    @Override
    public boolean modificar(Modalidad_tutoria modalidad_tutoria) throws Exception {
boolean eje = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from master.f_update_facultad(?,?,?,?)";
            lstP.add(new Parametro(1, modalidad_tutoria.getNombre()));
            lstP.add(new Parametro(2, modalidad_tutoria.getDescripcion()));
            lstP.add(new Parametro(3, modalidad_tutoria.getEstado()));
            lstP.add(new Parametro(4, modalidad_tutoria.getCodigo_MT()));
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
    public boolean eliminar(Modalidad_tutoria modalidad_tutoria) throws Exception {
        boolean eje = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from master.f_delete_facultad(?)";
            lstP.add(new Parametro(1, modalidad_tutoria.getCodigo_MT()));
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
    public Modalidad_tutoria obtener(int codigo_MT) throws Exception {
         Modalidad_tutoria lst;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from master.f_select_facultad_dado_codigo(?)";
            lstP.add(new Parametro(1, codigo_MT));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = new Modalidad_tutoria();
            lst = llenarModalidad_tutorias(rs).get(0);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    @Override
    public List<Modalidad_tutoria> obtener() throws Exception {
            ArrayList<Modalidad_tutoria> lst = new ArrayList<Modalidad_tutoria>();
        try {
            String sql = "select * from master.f_select_facultad()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarModalidad_tutorias(rs);
            rs = null;

        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

}
