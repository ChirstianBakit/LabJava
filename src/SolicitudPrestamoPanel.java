import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SolicitudPrestamoPanel {
    public void mostrar() {
        JFrame frame = new JFrame("Solicitud de Préstamo");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(600, 500);

        JPanel panelFormulario = new JPanel(new GridLayout(11, 2, 10, 10));

        JTextField textNombre = new JTextField();
        JTextField textApellido = new JTextField();
        JTextField textCedula = new JTextField();
        JTextField textNacimiento = new JTextField();
        JTextField textDireccion = new JTextField();
        JTextField textTelefono = new JTextField();
        JTextField textCorreo = new JTextField();
        JTextField textMontoSolicitado = new JTextField();
        JTextField textPlazo = new JTextField();
        JComboBox<String> comboPeriodo = new JComboBox<>(new String[]{"Días", "Meses", "Años"});
        JTextField textIngresoMensual = new JTextField();
        JTextField textMotivo = new JTextField();

        JButton btn_EnviarSolicitud = new JButton("Enviar Solicitud");
        JButton btn_Cancelar = new JButton("Cancelar");

        // Agregar componentes al panel
        panelFormulario.add(new JLabel("Nombre:"));
        panelFormulario.add(textNombre);
        panelFormulario.add(new JLabel("Apellido:"));
        panelFormulario.add(textApellido);
        panelFormulario.add(new JLabel("Cédula:"));
        panelFormulario.add(textCedula);
        panelFormulario.add(new JLabel("Fecha de Nacimiento:"));
        panelFormulario.add(textNacimiento);
        panelFormulario.add(new JLabel("Dirección:"));
        panelFormulario.add(textDireccion);
        panelFormulario.add(new JLabel("Teléfono:"));
        panelFormulario.add(textTelefono);
        panelFormulario.add(new JLabel("Correo Electrónico:"));
        panelFormulario.add(textCorreo);
        panelFormulario.add(new JLabel("Monto Solicitado:"));
        panelFormulario.add(textMontoSolicitado);
        panelFormulario.add(new JLabel("Plazo de Pago:"));
        panelFormulario.add(textPlazo);
        panelFormulario.add(new JLabel("Periodo:"));
        panelFormulario.add(comboPeriodo);
        panelFormulario.add(new JLabel("Ingreso Mensual:"));
        panelFormulario.add(textIngresoMensual);
        panelFormulario.add(new JLabel("Motivo del Préstamo:"));
        panelFormulario.add(textMotivo);

        JPanel panelBotones = new JPanel();
        panelBotones.add(btn_EnviarSolicitud);
        panelBotones.add(btn_Cancelar);

        frame.add(panelFormulario, BorderLayout.CENTER);
        frame.add(panelBotones, BorderLayout.SOUTH);

        btn_EnviarSolicitud.addActionListener((ActionEvent e) -> {
            guardarPrestamo(
                textNombre.getText(), textApellido.getText(), textCedula.getText(),
                textNacimiento.getText(), textDireccion.getText(), textTelefono.getText(),
                textCorreo.getText(), Double.parseDouble(textMontoSolicitado.getText()),
                Integer.parseInt(textPlazo.getText()), (String) comboPeriodo.getSelectedItem(),
                Double.parseDouble(textIngresoMensual.getText()), textMotivo.getText()
            );
        });

        btn_Cancelar.addActionListener(e -> frame.dispose());
        frame.setVisible(true);
    }

    private void guardarPrestamo(String nombre, String apellido, String cedula, String nacimiento, String direccion,
                                 String telefono, String correo, double montoSolicitado, int plazo, String periodo,
                                 double ingresoMensual, String motivo) {
        Connection conn = ConexionBD.getConexion();
        if (conn != null) {
            try {
                String sql = "INSERT INTO prestamos (nombre, apellido, cedula, fecha_nacimiento, direccion, telefono, correo, monto, plazo, periodo, ingreso_mensual, motivo) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement pstmt = conn.prepareStatement(sql);
                pstmt.setString(1, nombre);
                pstmt.setString(2, apellido);
                pstmt.setString(3, cedula);
                pstmt.setString(4, nacimiento);
                pstmt.setString(5, direccion);
                pstmt.setString(6, telefono);
                pstmt.setString(7, correo);
                pstmt.setDouble(8, montoSolicitado);
                pstmt.setInt(9, plazo);
                pstmt.setString(10, periodo);
                pstmt.setDouble(11, ingresoMensual);
                pstmt.setString(12, motivo);

                pstmt.executeUpdate();
                JOptionPane.showMessageDialog(null, "Préstamo registrado con éxito.");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error al guardar el préstamo: " + e.getMessage());
            }
        }
    }
}