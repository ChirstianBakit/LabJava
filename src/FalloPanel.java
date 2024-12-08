import javax.swing.*;
import java.awt.*;

public class FalloPanel {

    public void mostrar() {
        // Creación del JFrame principal
        JFrame frame = new JFrame("Error en la Operación");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(400, 150);

        // Panel principal con GridLayout
        JPanel panelFallo = new JPanel(new GridLayout(2, 1, 10, 10));
        panelFallo.setBorder(BorderFactory.createTitledBorder("Operación Fallida"));

        // Icono y mensaje de error
        JLabel labelErrorIcon = new JLabel("❌", JLabel.CENTER);
        labelErrorIcon.setFont(new Font("Arial", Font.PLAIN, 30));
        JLabel labelMensaje = new JLabel("Error: No se pudo completar la operación.", JLabel.CENTER);
        labelMensaje.setFont(new Font("Arial", Font.PLAIN, 14));

        // Añadir componentes al panel
        panelFallo.add(labelErrorIcon);
        panelFallo.add(labelMensaje);

        // Botón Aceptar
        JButton btnAceptarFallo = new JButton("Aceptar");
        btnAceptarFallo.setBackground(new Color(255, 51, 51));
        btnAceptarFallo.setForeground(Color.WHITE);

        // Panel de botones
        JPanel panelBotones = new JPanel(new FlowLayout());
        panelBotones.add(btnAceptarFallo);

        // Acción del botón
        btnAceptarFallo.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame, "Operación cancelada.", "Cancelación", JOptionPane.WARNING_MESSAGE);
            frame.dispose();
        });

        // Añadir paneles al JFrame
        frame.add(panelFallo, BorderLayout.CENTER);
        frame.add(panelBotones, BorderLayout.SOUTH);

        // Hacer visible la ventana
        frame.setVisible(true);
    }

}