import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class HistorialPanel {

    public void mostrar() {
        // Creación del JFrame principal
        JFrame frame = new JFrame("Historial de Préstamos");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(800, 400);

        // Panel principal con BorderLayout
        JPanel panelHistorial = new JPanel(new BorderLayout(10, 10));
        panelHistorial.setBorder(BorderFactory.createTitledBorder("Historial de Préstamos"));

        // Título
        JLabel titulo = new JLabel("Historial de Préstamos", SwingConstants.CENTER);
        titulo.setFont(new Font("Arial Black", Font.PLAIN, 18));
        panelHistorial.add(titulo, BorderLayout.NORTH);

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
                        "Código del Préstamo", "Fecha de Inicio", "Fecha de Finalización", 
                        "Monto Total", "Plazo Restante", "Saldo Pendiente", "Estado"
                }
        ));
        JScrollPane scrollPane = new JScrollPane(table);
        panelHistorial.add(scrollPane, BorderLayout.CENTER);

        // Crear botones de radio para el filtro
        JRadioButton jrbPrestamosActivos = new JRadioButton("Préstamos Activos");
        JRadioButton jrbPrestamosFinalizados = new JRadioButton("Préstamos Finalizados");

        ButtonGroup botonGrupoHistorial = new ButtonGroup();
        botonGrupoHistorial.add(jrbPrestamosActivos);
        botonGrupoHistorial.add(jrbPrestamosFinalizados);

        // Panel para los filtros (con los radio buttons)
        JPanel panelFiltros = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panelFiltros.add(jrbPrestamosActivos);
        panelFiltros.add(jrbPrestamosFinalizados);

        panelHistorial.add(panelFiltros, BorderLayout.NORTH);

        // Botón de búsqueda
        JButton btnBuscarHistorial = new JButton("Buscar");
        btnBuscarHistorial.setBackground(new Color(51, 0, 204));
        btnBuscarHistorial.setFont(new Font("Arial Black", Font.PLAIN, 12));
        btnBuscarHistorial.setForeground(Color.WHITE);

        // Panel inferior para el botón de búsqueda
        JPanel panelInferior = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        panelInferior.add(btnBuscarHistorial);
        panelHistorial.add(panelInferior, BorderLayout.SOUTH);

        // Añadir panel al JFrame
        frame.add(panelHistorial);

        // Hacer visible la ventana
        frame.setVisible(true);
    }
}
