import javax.swing.*;
import java.awt.*;

public class GestionPagosPanel {

    public void mostrar() {
        // Crear el JFrame principal
        JFrame frame = new JFrame("Gestión de Pagos");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(600, 200);
        frame.setLayout(new BorderLayout());

        // Crear el panel principal
        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new GridLayout(2, 1, 10, 10));
        panelPrincipal.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Crear el título
        JLabel titulo = new JLabel("Gestión de Pagos", SwingConstants.CENTER);
        titulo.setFont(new Font("Arial Black", Font.PLAIN, 18));
        panelPrincipal.add(titulo);

        // Crear el panel de botones
        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 10));

        JButton btnRealizarPago = new JButton("Realizar Pago");
        btnRealizarPago.setFont(new Font("Arial", Font.BOLD, 12));
        btnRealizarPago.addActionListener(e -> realizarPago());

        JButton btnHistorialPago = new JButton("Historial de Pago");
        btnHistorialPago.setFont(new Font("Arial", Font.BOLD, 12));
        btnHistorialPago.addActionListener(e -> mostrarHistorial());

        panelBotones.add(btnRealizarPago);
        panelBotones.add(btnHistorialPago);

        // Añadir los componentes al panel principal
        panelPrincipal.add(panelBotones);

        // Añadir el panel principal al JFrame
        frame.add(panelPrincipal, BorderLayout.CENTER);

        // Mostrar el JFrame
        frame.setVisible(true);
    }

    // Método para realizar acciones al presionar "Realizar Pago"
    private void realizarPago() {
        JOptionPane.showMessageDialog(null, "Función para realizar un pago.", "Realizar Pago", JOptionPane.INFORMATION_MESSAGE);
    }

    // Método para mostrar acciones al presionar "Historial de Pago"
    private void mostrarHistorial() {
        JOptionPane.showMessageDialog(null, "Función para ver el historial de pagos.", "Historial de Pago", JOptionPane.INFORMATION_MESSAGE);
    }
}