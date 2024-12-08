import javax.swing.*;
import java.awt.*;

public class FormularioPagoPanel {

    public void mostrar() {
        // Creación del JFrame principal
        JFrame frame = new JFrame("Formulario de Pago");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(400, 350);

        // Panel principal con GridLayout
        JPanel panelFormulario = new JPanel(new GridLayout(7, 2, 10, 10));
        panelFormulario.setBorder(BorderFactory.createTitledBorder("Datos del Pago"));

        // Etiquetas y campos de texto
        JLabel labelIdPrestamo = new JLabel("ID del Préstamo:");
        JTextField txtIdPrestamo = new JTextField();

        JLabel labelMontoPagar = new JLabel("Monto a Pagar:");
        JTextField txtMontoPagar = new JTextField();

        JLabel labelTarjeta = new JLabel("Tarjeta:");
        JComboBox<String> comboTarjeta = new JComboBox<>(new String[]{"Débito", "Crédito"});

        JLabel labelNumeroTarjeta = new JLabel("Número de Tarjeta:");
        JTextField txtNumeroTarjeta = new JTextField();

        JLabel labelNombreTitular = new JLabel("Nombre del Titular:");
        JTextField txtNombreTitular = new JTextField();

        JLabel labelFechaExpiracion = new JLabel("Fecha de Expiración:");
        JPanel panelFecha = new JPanel(new GridLayout(1, 2));
        JComboBox<String> comboMes = new JComboBox<>(new String[]{"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"});
        JComboBox<String> comboAnio = new JComboBox<>(new String[]{"2024", "2025", "2026", "2027", "2028", "2029"});
        panelFecha.add(comboMes);
        panelFecha.add(comboAnio);

        JLabel labelCVV = new JLabel("Código CVV:");
        JTextField txtCVV = new JTextField();

        // Añadir componentes al panel
        panelFormulario.add(labelIdPrestamo);
        panelFormulario.add(txtIdPrestamo);

        panelFormulario.add(labelMontoPagar);
        panelFormulario.add(txtMontoPagar);

        panelFormulario.add(labelTarjeta);
        panelFormulario.add(comboTarjeta);

        panelFormulario.add(labelNumeroTarjeta);
        panelFormulario.add(txtNumeroTarjeta);

        panelFormulario.add(labelNombreTitular);
        panelFormulario.add(txtNombreTitular);

        panelFormulario.add(labelFechaExpiracion);
        panelFormulario.add(panelFecha);

        panelFormulario.add(labelCVV);
        panelFormulario.add(txtCVV);

        // Botones
        JButton btnRealizarPago = new JButton("Realizar Pago");
        btnRealizarPago.setBackground(new Color(0, 153, 0));
        btnRealizarPago.setForeground(Color.WHITE);

        JButton btnCancelarPago = new JButton("Cancelar Pago");
        btnCancelarPago.setBackground(new Color(255, 51, 51));
        btnCancelarPago.setForeground(Color.WHITE);

        JPanel panelBotones = new JPanel(new FlowLayout());
        panelBotones.add(btnRealizarPago);
        panelBotones.add(btnCancelarPago);

        // Acciones de los botones
        btnRealizarPago.addActionListener(e -> {
            realizarPago(
                txtIdPrestamo.getText(),
                txtMontoPagar.getText(),
                comboTarjeta.getSelectedItem().toString(),
                txtNumeroTarjeta.getText(),
                txtNombreTitular.getText(),
                comboMes.getSelectedItem().toString(),
                comboAnio.getSelectedItem().toString(),
                txtCVV.getText()
            );
        });

        btnCancelarPago.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame, "Pago cancelado.", "Cancelación", JOptionPane.WARNING_MESSAGE);
            frame.dispose();
        });

        // Añadir paneles al JFrame
        frame.add(panelFormulario, BorderLayout.CENTER);
        frame.add(panelBotones, BorderLayout.SOUTH);

        frame.setVisible(true);
    }

    // Método para procesar el pago
    private void realizarPago(String idPrestamo, String monto, String tipoTarjeta, String numeroTarjeta, String nombreTitular, String mes, String anio, String cvv) {
        // Simular procesamiento de pago
        JOptionPane.showMessageDialog(null,
                "Pago Realizado Exitosamente:\n" +
                "ID del Préstamo: " + idPrestamo + "\n" +
                "Monto: $" + monto + "\n" +
                "Tarjeta: " + tipoTarjeta + "\n" +
                "Número de Tarjeta: " + numeroTarjeta + "\n" +
                "Nombre del Titular: " + nombreTitular + "\n" +
                "Fecha de Expiración: " + mes + "/" + anio + "\n" +
                "CVV: " + cvv,
                "Confirmación de Pago",
                JOptionPane.INFORMATION_MESSAGE);
    }

}