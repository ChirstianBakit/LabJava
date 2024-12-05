import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class MenuPrincipal {
    public void mostrar() {
        JFrame frame = new JFrame("Menú Principal");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);
        frame.setLayout(new BorderLayout());

        // Panel principal con botones
        JPanel panelMenu = new JPanel(new GridLayout(4, 1, 10, 10));

        JButton btn_inicio = new JButton("Inicio");
        JButton btn_solicitarPrestamo = new JButton("Solicitar Préstamo");
        JButton btn_historial = new JButton("Historial");
        JButton btn_pagos = new JButton("Pagos");

        panelMenu.add(btn_inicio);
        panelMenu.add(btn_solicitarPrestamo);
        panelMenu.add(btn_historial);
        panelMenu.add(btn_pagos);

        // Agregar el panel al marco
        frame.add(panelMenu, BorderLayout.CENTER);

        // Acciones de los botones
        btn_inicio.addActionListener((ActionEvent e) -> {
            ResumenInformativoPanel resumenPanel = new ResumenInformativoPanel();
            resumenPanel.mostrar();
        });

        btn_solicitarPrestamo.addActionListener((ActionEvent e) -> {
            SolicitudPrestamoPanel solicitudPanel = new SolicitudPrestamoPanel();
            solicitudPanel.mostrar();
        });

        btn_historial.addActionListener((ActionEvent e) -> {
            HistorialPrestamoPanel historialPanel = new HistorialPrestamoPanel();
            historialPanel.mostrar();
        });

        btn_pagos.addActionListener((ActionEvent e) -> {
            PagosPanel pagosPanel = new PagosPanel();
            pagosPanel.mostrar();
        });

        // Mostrar la ventana
        frame.setVisible(true);
    }
}