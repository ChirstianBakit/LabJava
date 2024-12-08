import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class GestionUsuarioPanel {

    public void mostrar() {
        // Creación del JFrame principal
        JFrame frame = new JFrame("Gestión de Usuarios");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(800, 400);

        // Panel principal con BorderLayout
        JPanel panelGestionUsuario = new JPanel(new BorderLayout(10, 10));
        panelGestionUsuario.setBorder(BorderFactory.createTitledBorder("Lista de Usuarios"));

        // Título
        JLabel titulo = new JLabel("Lista de Usuario", SwingConstants.CENTER);
        titulo.setFont(new Font("Arial Black", Font.PLAIN, 18));
        panelGestionUsuario.add(titulo, BorderLayout.NORTH);

        // Crear la tabla
        JTable table = new JTable();
        table.setModel(new DefaultTableModel(
                new Object[][] {
                        {null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null}
                },
                new String[] {
                        "Nombre", "Apellido", "Cédula o Pasaporte", "Teléfono", "Fecha de Nacimiento", "Dirección", "Correo"
                }
        ));
        JScrollPane scrollPane = new JScrollPane(table);
        panelGestionUsuario.add(scrollPane, BorderLayout.CENTER);

        // Botón Salir
        JButton btnSalirUsuario = new JButton("Salir");
        btnSalirUsuario.setBackground(new Color(153, 153, 153));
        btnSalirUsuario.setFont(new Font("Arial Black", Font.PLAIN, 12));
        btnSalirUsuario.setForeground(Color.WHITE);
        btnSalirUsuario.addActionListener(evt -> System.exit(0));

        // Panel de la parte superior (con título y botón salir)
        JPanel panelSuperior = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        panelSuperior.add(btnSalirUsuario);

        panelGestionUsuario.add(panelSuperior, BorderLayout.NORTH);

        // Añadir panel al JFrame
        frame.add(panelGestionUsuario);

        // Hacer visible la ventana
        frame.setVisible(true);
    }
}