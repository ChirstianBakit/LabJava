import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class GestionPrestamosPanel {

    public void mostrar() {
        // Creación del JFrame principal
        JFrame frame = new JFrame("Gestión de Préstamos");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(800, 400);

        // Panel principal con GridLayout
        JPanel panelGestion = new JPanel(new BorderLayout(10, 10));
        panelGestion.setBorder(BorderFactory.createTitledBorder("Administrar Préstamos"));

        // Título
        JLabel titulo = new JLabel("Gestión de Préstamos", SwingConstants.CENTER);
        titulo.setFont(new Font("Arial Black", Font.PLAIN, 18));
        panelGestion.add(titulo, BorderLayout.NORTH);

        // Crear la tabla
        JTable table = new JTable();
        table.setModel(new DefaultTableModel(
                new Object[][] {
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null}
                },
                new String[] {
                        "ID Préstamo", "Nombre", "Apellido", "Monto Solicitado", "Fecha de Solicitud", "Estado"
                }
        ));
        JScrollPane scrollPane = new JScrollPane(table);
        panelGestion.add(scrollPane, BorderLayout.CENTER);

        // Panel para los botones de aprobación y rechazo
        JPanel panelAcciones = new JPanel(new GridLayout(3, 1, 10, 10));
        panelAcciones.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Campo de texto para el ID del préstamo
        JPanel panelId = new JPanel(new FlowLayout());
        JLabel labelId = new JLabel("ID del Préstamo:");
        JTextField txtIdPrestamo = new JTextField(10);
        panelId.add(labelId);
        panelId.add(txtIdPrestamo);
        panelAcciones.add(panelId);

        // Botones de Aprobar y Rechazar
        JPanel panelBotones = new JPanel(new FlowLayout());
        JRadioButton rbAprobar = new JRadioButton("Aprobar");
        JRadioButton rbRechazar = new JRadioButton("Rechazar");
        ButtonGroup group = new ButtonGroup();
        group.add(rbAprobar);
        group.add(rbRechazar);
        panelBotones.add(rbAprobar);
        panelBotones.add(rbRechazar);
        panelAcciones.add(panelBotones);

        // Botón de Confirmación
        JButton btnConfirmar = new JButton("Confirmar");
        btnConfirmar.setBackground(new Color(0, 0, 153));
        btnConfirmar.setForeground(Color.WHITE);
        btnConfirmar.addActionListener(e -> {
            String idPrestamo = txtIdPrestamo.getText();
            String accion = rbAprobar.isSelected() ? "Aprobado" : "Rechazado";
            JOptionPane.showMessageDialog(frame, "Préstamo " + accion + " (ID: " + idPrestamo + ")", "Confirmación", JOptionPane.INFORMATION_MESSAGE);
        });
        panelAcciones.add(btnConfirmar);

        // Añadir panel de acciones al panel principal
        panelGestion.add(panelAcciones, BorderLayout.EAST);

        // Añadir panel al JFrame
        frame.add(panelGestion);

        // Mostrar JFrame
        frame.setVisible(true);
    }
}