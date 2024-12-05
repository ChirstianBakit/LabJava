import javax.swing.*;
import java.awt.*;

public class ResumenInformativoPanel {
    public void mostrar() {
        JFrame frame = new JFrame("Resumen Informativo");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(400, 300);

        JPanel panelResumen = new JPanel(new GridLayout(4, 2, 10, 10));
        panelResumen.setBorder(BorderFactory.createTitledBorder("Resumen"));

        JLabel label_prestamoActivo = new JLabel("Préstamos Activos:");
        JLabel label_montoTotal = new JLabel("Monto Total:");
        JLabel label_fecha = new JLabel("Fecha del Próximo Pago:");
        JLabel label_cuota = new JLabel("Cuota:");

        JLabel txtPrestamosActivos = new JLabel();
        JLabel txtMontoTotal = new JLabel();
        JLabel txtFechaPago = new JLabel();
        JLabel txtCuota = new JLabel();

        panelResumen.add(label_prestamoActivo);
        panelResumen.add(txtPrestamosActivos);
        panelResumen.add(label_montoTotal);
        panelResumen.add(txtMontoTotal);
        panelResumen.add(label_fecha);
        panelResumen.add(txtFechaPago);
        panelResumen.add(label_cuota);
        panelResumen.add(txtCuota);

        // Botón actualizar
        JButton btnActualizar = new JButton("Actualizar");
        btnActualizar.addActionListener(e -> {
            String[] datos = obtenerResumen();
            txtPrestamosActivos.setText(datos[0]);
            txtMontoTotal.setText(datos[1]);
            txtFechaPago.setText(datos[2]);
            txtCuota.setText(datos[3]);
        });

        frame.add(panelResumen, BorderLayout.CENTER);
        frame.add(btnActualizar, BorderLayout.SOUTH);
        frame.setVisible(true);

        btnActualizar.doClick(); // Actualizar al iniciar
    }

    private String[] obtenerResumen() {
        // Aquí podrías conectar con la base de datos para obtener datos reales
        return new String[]{"5", "120000.0", "2024-12-20", "500.0"};
    }
}