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
import proyecto_final_tutorias.dao.IEstudiante;
import proyecto_final_tutorias.entidades.Estudiante;

/**
 *
 * @author CRISTIAN
 */
public class EstudianteImpl implements IEstudiante  {

    @Override
    public boolean insertar(Estudiante estudiante) throws Exception {
        boolean eje = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from master.f_insert_facultad(?,?,?,?)";
            lstP.add(new Parametro(1, estudiante.getCodigo_E()));
            lstP.add(new Parametro(2, estudiante.getNombre()));
            lstP.add(new Parametro(3, estudiante.getApellido()));
            lstP.add(new Parametro(4, estudiante.getCedula()));
             lstP.add(new Parametro(5, estudiante.getCodigo_sicoa()));
            lstP.add(new Parametro(6, estudiante.getPeriodo().getCodigo_P()));
            lstP.add(new Parametro(7, estudiante.getNivel().getCodigo_N()));
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
    public static ArrayList<Estudiante> llenarEstudiantes(ConjuntoResultado rs) throws Exception {
        ArrayList<Estudiante> lst = new ArrayList<Estudiante>();
        Estudiante estudiante = null;
        try {
            while (rs.next()) {
                estudiante = new Estudiante(rs.getInt("pcodigo"), rs.getString("pnombre"), rs.getString("papellido"), rs.getString("pcedula"), rs.getInt("pcodigo_sicoa"), rs.getInt(1), rs.getInt(1));
                lst.add(estudiante);
            }
        } catch (Exception e) {
            lst.clear();
            throw e;
        }
        return lst;
    }

    @Override
    public boolean modificar(Estudiante estudiante) throws Exception {
        boolean eje = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from master.f_update_facultad(?,?,?,?)";
            lstP.add(new Parametro(1, estudiante.getNombre()));
            lstP.add(new Parametro(2, estudiante.getApellido()));
            lstP.add(new Parametro(3, estudiante.getCedula()));
            lstP.add(new Parametro(4, estudiante.getCodigo_sicoa()));
            lstP.add(new Parametro(5, estudiante.getPeriodo().getCodigo_P()));
            lstP.add(new Parametro(6, estudiante.getNivel().getCodigo_N()));
            lstP.add(new Parametro(7, estudiante.getCodigo_E()));
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
    public boolean eliminar(Estudiante estudiante) throws Exception {
        boolean eje = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from master.f_delete_facultad(?)";
            lstP.add(new Parametro(1, estudiante.getCodigo_E()));
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
    public Estudiante obtener(int codigo_E) throws Exception {
        Estudiante lst;
        try {
            ArrayList<Parametro> lstP = new ArrayList<Parametro>();
            String sql = "select * from master.f_select_facultad_dado_codigo(?)";
            lstP.add(new Parametro(1, codigo_E));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            lst = new Estudiante();
            lst = llenarEstudiantes(rs).get(0);
            rs = null;
        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }

    @Override
    public List<Estudiante> obtener() throws Exception {
       ArrayList<Estudiante> lst = new ArrayList<Estudiante>();
        try {
            String sql = "select * from master.f_select_facultad()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lst = llenarEstudiantes(rs);
            rs = null;

        } catch (SQLException exConec) {
            throw new Exception(exConec.getMessage());
        }
        return lst;
    }
    
}
