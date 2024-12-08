import javax.swing.*;
import java.awt.*;

public class ResumenInformativoPanel {

    public void mostrar() {
        // Creación del JFrame principal
        JFrame frame = new JFrame("Resumen Informativo");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(400, 300);

        // Panel principal con GridLayout
        JPanel panelResumen = new JPanel(new GridLayout(4, 2, 10, 10));
        panelResumen.setBorder(BorderFactory.createTitledBorder("Préstamos Activos y Próximos Pagos"));

        // Etiquetas y campos de texto
        JLabel labelTotal = new JLabel("Total:");
        JTextField txtTotal = new JTextField();
        txtTotal.setEditable(false);

        JLabel labelMontoTotal = new JLabel("Monto Total:");
        JTextField txtMontoTotal = new JTextField();
        txtMontoTotal.setEditable(false);

        JLabel labelFecha = new JLabel("Fecha:");
        JTextField txtFecha = new JTextField();
        txtFecha.setEditable(false);

        JLabel labelCuota = new JLabel("Cuota:");
        JTextField txtCuota = new JTextField();
        txtCuota.setEditable(false);

        // Añadir componentes al panel
        panelResumen.add(labelTotal);
        panelResumen.add(txtTotal);

        panelResumen.add(labelMontoTotal);
        panelResumen.add(txtMontoTotal);

        panelResumen.add(labelFecha);
        panelResumen.add(txtFecha);

        panelResumen.add(labelCuota);
        panelResumen.add(txtCuota);

        // Botón actualizar
        JButton btnActualizar = new JButton("Actualizar");
        btnActualizar.addActionListener(e -> {
            String[] datos = obtenerResumen();
            txtTotal.setText(datos[0]);
            txtMontoTotal.setText(datos[1]);
            txtFecha.setText(datos[2]);
            txtCuota.setText(datos[3]);
        });

        // Añadir panel y botón al JFrame
        frame.add(panelResumen, BorderLayout.CENTER);
        frame.add(btnActualizar, BorderLayout.SOUTH);

        // Mostrar la ventana
        frame.setVisible(true);

        // Llamar al botón de actualizar al iniciar
        btnActualizar.doClick();
    }

    // Método para simular datos desde una base de datos
    private String[] obtenerResumen() {
        // Aquí puedes conectar a una base de datos real
        return new String[]{"5", "150000.0", "2024-12-20", "500.0"};
    }

}