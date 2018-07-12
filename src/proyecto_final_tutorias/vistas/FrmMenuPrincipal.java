/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_final_tutorias.vistas;

import java.awt.BorderLayout;
import java.awt.Color;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDesktopPane;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author CRISTIAN
 */
public class FrmMenuPrincipal extends JFrame {
    JMenuBar mnbPrincipal;
    JMenu mnInicio;
    JMenuItem mniLogin;
    JMenuItem mniSalir;
    JMenu mnAmbito;
    JMenuItem mniNuevoAmbito;
    JMenuItem mniModificaAmbito;
    JMenuItem mniEliminaAmbito;
    JMenuItem mniBuscarAmbito;
    JMenuItem mniListarAmbito;
        JMenu mnEstudiante;
    JMenuItem mniNuevoEstudiante;
    JMenuItem mniModificaEstudiante;
    JMenuItem mniEliminaEstudiante;
    JMenuItem mniBuscarEstudiante;
    JMenuItem mniListarEstudiante;
    JMenu mnModalidad;
    JMenuItem mniNuevoModalidad;
    JMenuItem mniModificaModalidad;
    JMenuItem mniEliminaModalidad;
    JMenuItem mniBuscarModalidad;
    JMenuItem mniListarModalidad;
    JMenu mnPeriodo;
    JMenuItem mniNuevoPeriodo;
    JMenuItem mniModificaPeriodo;
    JMenuItem mniEliminaPeriodo;
    JMenuItem mniBuscarPeriodo;
    JMenuItem mniListarPeriodo;
    JMenu mnNivel;
    JMenuItem mniNuevoNivel;
    JMenuItem mniModificaNivel;
    JMenuItem mniEliminaNivel;
    JMenuItem mniBuscarNivel;
    JMenuItem mniListarNivel;
    private JMenuItem itemReporteDiario;
    JMenu menuReportes;
    JDesktopPane dkpEscritorio;

    public FrmMenuPrincipal() {
        dkpEscritorio = new JDesktopPane();
        dkpEscritorio.setBackground(new Color(240, 240, 240));
        mnbPrincipal = new JMenuBar();
        mnInicio = new JMenu("Inicio");
        mniLogin = new JMenuItem("Iniciar Seciòn");
        mniSalir = new JMenuItem("Salir");
        mniSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mniSalirActionPerformed(e);
            }
        });
        mnAmbito = new JMenu("Ambito");
        mnEstudiante = new JMenu("Estudiante");
        mnModalidad = new JMenu("Modalidad");
        mnPeriodo = new JMenu("Periodo");
        mnNivel = new JMenu("Nivel");
        menuReportes = new JMenu("Reportes");
        itemReporteDiario = new JMenuItem("Reporte Diario");
        mniNuevoAmbito = new JMenuItem("Cliente");
        mniModificaAmbito = new JMenuItem("Modificar");
        mniEliminaAmbito = new JMenuItem("Eliminar");
        mniBuscarAmbito = new JMenuItem("Buscar");
        mniListarAmbito = new JMenuItem("Listar");


        mniNuevoEstudiante = new JMenuItem("Nuevo");
        mniModificaEstudiante = new JMenuItem("Modificar");
        mniEliminaEstudiante = new JMenuItem("Eliminar");
        mniBuscarEstudiante = new JMenuItem("Buscar");
        mniListarEstudiante = new JMenuItem("Listar");


        mniNuevoModalidad = new JMenuItem("Nuevo");
        mniModificaModalidad = new JMenuItem("Modificar");
        mniEliminaModalidad = new JMenuItem("Eliminar");
        mniBuscarModalidad = new JMenuItem("Buscar");
        mniListarModalidad = new JMenuItem("Listar");


        mniNuevoPeriodo = new JMenuItem("Nuevo");
        mniModificaPeriodo = new JMenuItem("Modificar");
        mniEliminaPeriodo = new JMenuItem("Eliminar");
        mniBuscarPeriodo = new JMenuItem("Buscar");
        mniListarPeriodo = new JMenuItem("Listar");
   

        mniNuevoNivel = new JMenuItem("Nuevo");
        mniModificaNivel = new JMenuItem("Modificar");
        mniEliminaNivel = new JMenuItem("Eliminar");
        mniBuscarNivel = new JMenuItem("Buscar");
        mniListarNivel = new JMenuItem("Listar");

        mnAmbito.add(mniNuevoAmbito);
        mnAmbito.add(mniModificaAmbito);
        mnAmbito.add(mniEliminaAmbito);
        mnAmbito.addSeparator();
        mnAmbito.add(mniBuscarAmbito);
        mnAmbito.add(mniListarAmbito);
        mnbPrincipal.add(mnInicio);
        mnbPrincipal.add(mnAmbito);
        mnbPrincipal.add(mnEstudiante);
        mnbPrincipal.add(mnModalidad);
        mnbPrincipal.add(mnPeriodo);
        mnbPrincipal.add(mnNivel);
        mnInicio.add(mniLogin);
        mnInicio.add(mniSalir);

        mnEstudiante.add(mniNuevoEstudiante);
        mnEstudiante.add(mniModificaEstudiante);
        mnEstudiante.add(mniEliminaEstudiante);
        mnEstudiante.addSeparator();
        mnEstudiante.add(mniBuscarEstudiante);
        mnEstudiante.add(mniListarEstudiante);

        mnModalidad.add(mniNuevoModalidad);
        mnModalidad.add(mniModificaModalidad);
        mnModalidad.add(mniEliminaModalidad);
        mnModalidad.addSeparator();
        mnModalidad.add(mniBuscarModalidad);
        mnModalidad.add(mniListarModalidad);

        mnPeriodo.add(mniNuevoPeriodo);
        mnPeriodo.add(mniModificaPeriodo);
        mnPeriodo.add(mniEliminaPeriodo);
        mnPeriodo.addSeparator();
        mnPeriodo.add(mniBuscarPeriodo);
        mnPeriodo.add(mniListarPeriodo);

        mnNivel.add(mniNuevoNivel);
        mnNivel.add(mniModificaNivel);
        mnNivel.add(mniEliminaNivel);
        mnNivel.addSeparator();
        mnNivel.add(mniBuscarNivel);
        mnNivel.add(mniListarNivel);
        
        mnbPrincipal.add(menuReportes);
        menuReportes.add(itemReporteDiario);

        this.setLayout(new BorderLayout());
        this.add(mnbPrincipal, BorderLayout.NORTH);
        this.add(dkpEscritorio, BorderLayout.CENTER);
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setBounds(0, 0, 500, 450);
    }

    public void mniSalirActionPerformed(ActionEvent e) {
        System.exit(0);
    }

    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        FrmMenuPrincipal frmMEnu = new FrmMenuPrincipal();
        frmMEnu.setVisible(true);

    }

}

