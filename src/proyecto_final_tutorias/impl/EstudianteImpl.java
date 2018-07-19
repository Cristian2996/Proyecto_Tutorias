/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_final_tutorias.impl;

import accesodatos.AccesoDatos;
import accesodatos.Conexion;
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
public class EstudianteImpl implements IEstudiante {

    @Override
    public boolean insertar(Estudiante estudiante) throws Exception {
        boolean eje = false;
        try {
            String sql = "insert into Venta values "
                    + "(?,?,?,?,?,?,?)";
            ArrayList<Parametro> lstPar = new ArrayList<Parametro>();
            lstPar.add(new Parametro(1, estudiante.getCodigo_E()));
            lstPar.add(new Parametro(2, estudiante.getNombre()));
            lstPar.add(new Parametro(3, estudiante.getApellido()));
            lstPar.add(new Parametro(4, estudiante.getCedula()));
            lstPar.add(new Parametro(5, estudiante.getCodigo_sicoa()));
            lstPar.add(new Parametro(6, estudiante.getPeriodo().getCodigo_P()));
            lstPar.add(new Parametro(7, estudiante.getNivel().getCodigo_N()));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstPar);
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
    public boolean modificar(Estudiante estudiante) throws Exception {
        boolean eje = false;
        try {
            String sql = "UPDATE venta"
                    + "   SET codigoVen=?, codigo_C=?, codigoV=?, fecha_emi=?,fecha_anu=? "
                    + " where codigoVen=?";
            ArrayList<Parametro> lstPar = new ArrayList<Parametro>();
            lstPar.add(new Parametro(1, estudiante.getNombre()));
            lstPar.add(new Parametro(2, estudiante.getApellido()));
            lstPar.add(new Parametro(3, estudiante.getCedula()));
            lstPar.add(new Parametro(4, estudiante.getCodigo_sicoa()));
            lstPar.add(new Parametro(5, estudiante.getPeriodo().getCodigo_P()));
            lstPar.add(new Parametro(6, estudiante.getNivel().getCodigo_N()));
            lstPar.add(new Parametro(7, estudiante.getCodigo_E()));

            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstPar);
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
        
    }

    @Override
    public Estudiante obtener(int codigo_E) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Estudiante> obtener() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
