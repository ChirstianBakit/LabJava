import javax.swing.*;
import java.awt.*;

public class AdministradorPanel {

    public void mostrar() {
        // Creación del JFrame principal
        JFrame frame = new JFrame("Opciones de Administrador");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(400, 200);

        // Panel principal con GridLayout
        JPanel panelAdministrador = new JPanel(new GridLayout(4, 1, 10, 10));
        panelAdministrador.setBorder(BorderFactory.createTitledBorder("Opciones de Administrador"));

        // Etiqueta de título
        JLabel labelTitulo = new JLabel("Opciones de Administrador", JLabel.CENTER);
        labelTitulo.setFont(new Font("Arial Black", Font.BOLD, 18));

        // Botones de acción
        JButton btnGestionUsuario = new JButton("Gestión de usuarios");
        btnGestionUsuario.setBackground(new Color(102, 102, 102));
        btnGestionUsuario.setForeground(Color.WHITE);
        btnGestionUsuario.setFont(new Font("Arial Black", Font.PLAIN, 12));

        JButton btnGestionPrestamo = new JButton("Gestión de préstamos");
        btnGestionPrestamo.setBackground(new Color(102, 102, 102));
        btnGestionPrestamo.setForeground(Color.WHITE);
        btnGestionPrestamo.setFont(new Font("Arial Black", Font.PLAIN, 12));

        // Separador entre la etiqueta y los botones
        JSeparator separator = new JSeparator();

        // Añadir los componentes al panel
        panelAdministrador.add(labelTitulo);
        panelAdministrador.add(separator);
        panelAdministrador.add(btnGestionUsuario);
        panelAdministrador.add(btnGestionPrestamo);

        // Botones adicionales o acciones pueden ir aquí
        JPanel panelBotones = new JPanel(new FlowLayout());
        panelBotones.add(btnGestionUsuario);
        panelBotones.add(btnGestionPrestamo);

        // Acción de los botones
        btnGestionUsuario.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame, "Gestión de usuarios seleccionada.", "Acción", JOptionPane.INFORMATION_MESSAGE);
        });

        btnGestionPrestamo.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame, "Gestión de préstamos seleccionada.", "Acción", JOptionPane.INFORMATION_MESSAGE);
        });

        // Añadir paneles al JFrame
        frame.add(panelAdministrador, BorderLayout.CENTER);
        frame.add(panelBotones, BorderLayout.SOUTH);

        // Hacer visible la ventana
        frame.setVisible(true);
    }
}
