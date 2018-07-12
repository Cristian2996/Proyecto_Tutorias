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
import proyecto_final_tutorias.dao.IPeriodo;
import proyecto_final_tutorias.entidades.Periodo;

/**
 *
 * @author CRISTIAN
 */
public class PeriodoImpl implements IPeriodo {

    @Override
    public boolean insertar(Periodo periodo) throws Exception {
        boolean eje = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from master.f_insert_facultad(?,?,?,?)";
            lstP.add(new Parametro(1, periodo.getCodigo_P()));
            lstP.add(new Parametro(2, periodo.getNombre()));
            lstP.add(new Parametro(3, periodo.getFecha_inicio()));
            lstP.add(new Parametro(4, periodo.getFecha_fin()));
            lstP.add(new Parametro(5, periodo.getTipo()));
            lstP.add(new Parametro(6, periodo.getObservaciones()));
            lstP.add(new Parametro(7, periodo.getCodigo_sicoa()));
            lstP.add(new Parametro(8, periodo.getEstado()));
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

    public static ArrayList<Periodo> llenarPeriodos(ConjuntoResultado rs) throws Exception {
        ArrayList<Periodo> lst = new ArrayList<Periodo>();
        Periodo periodo = null;
        try {
            while (rs.next()) {
                periodo = new Periodo(rs.getInt("pcodigo_P"), rs.getString("pnombre"), rs.getDate("pfecha_inicio"), rs.getDate("pfecha_fin"),
                         rs.getInt("ptipo"), rs.getString("pobservaciones"), rs.getInt("pcodigo_sicoa"), rs.getInt("pestado"));
                lst.add(periodo);
            }
        } catch (Exception e) {
            lst.clear();
            throw e;
        }
        return lst;
    }

    @Override
    public boolean modificar(Periodo periodo) throws Exception {
        boolean eje = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from master.f_update_facultad(?,?,?,?)";
            lstP.add(new Parametro(1, periodo.getNombre()));
            lstP.add(new Parametro(2, periodo.getFecha_inicio()));
            lstP.add(new Parametro(3, periodo.getFecha_fin()));
            lstP.add(new Parametro(4, periodo.getTipo()));
              lstP.add(new Parametro(1, periodo.getObservaciones()));
            lstP.add(new Parametro(2, periodo.getCodigo_sicoa()));
            lstP.add(new Parametro(3, periodo.getEstado()));
            lstP.add(new Parametro(4, periodo.getCodigo_P()));
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
    public boolean eliminar(Periodo periodo) throws Exception {
         boolean eje = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from master.f_delete_facultad(?)";
            lstP.add(new Parametro(1, periodo.getCodigo_P()));
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
    public Periodo obtener(int codigo_P) throws Exception {
        Periodo lst;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from master.f_select_facultad_dado_codigo(?)";
            lstP.add(new Parametro(1, codigo_P));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = new Periodo();
            lst = llenarPeriodos(rs).get(0);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    @Override
    public List<Periodo> obtener() throws Exception {
        ArrayList<Periodo> lst = new ArrayList<Periodo>();
        try {
            String sql = "select * from master.f_select_facultad()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarPeriodos(rs);
            rs = null;

        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

}
