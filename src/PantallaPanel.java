import javax.swing.*;
import java.awt.*;

public class PantallaPanel {

    public void mostrar() {
        // Creación del JFrame principal
        JFrame frame = new JFrame("Pantalla Principal");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(1200, 700);

        // Panel principal (fondo)
        JPanel fondo = new JPanel();
        fondo.setBackground(new java.awt.Color(255, 255, 255));

        // Menú lateral
        JPanel menu = new JPanel();
        menu.setBackground(new java.awt.Color(0, 0, 0));
        menu.setPreferredSize(new java.awt.Dimension(270, 640));

        JLabel prestcash = new JLabel("PRESTCASH", SwingConstants.CENTER);
        prestcash.setFont(new Font("Arial Black", Font.BOLD, 14));
        prestcash.setForeground(Color.WHITE);

        JSeparator separator = new JSeparator();
        separator.setPreferredSize(new Dimension(50, 5));

        JButton btnInicio = new JButton("Inicio");
        btnInicio.setBackground(new Color(102, 102, 102));
        btnInicio.setForeground(Color.WHITE);

        JButton btnPagos = new JButton("Pagos");
        btnPagos.setBackground(new Color(102, 102, 102));
        btnPagos.setForeground(Color.WHITE);

        JButton btnHistorial = new JButton("Historial");
        btnHistorial.setBackground(new Color(102, 102, 102));
        btnHistorial.setForeground(Color.WHITE);

        JButton btnSolicitarPrestamo = new JButton("Solicitar Préstamo");
        btnSolicitarPrestamo.setBackground(new Color(102, 102, 102));
        btnSolicitarPrestamo.setForeground(Color.WHITE);

        GroupLayout menuLayout = new GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
                menuLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(prestcash, GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                        .addGroup(menuLayout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(separator, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE))
                        .addComponent(btnInicio, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPagos, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnHistorial, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSolicitarPrestamo, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        menuLayout.setVerticalGroup(
                menuLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(menuLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(prestcash)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(separator, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(btnInicio, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnPagos, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnHistorial, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSolicitarPrestamo, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        // Header
        JPanel header = new JPanel();
        header.setBackground(new Color(0, 204, 204));

        JLabel bienvenido = new JLabel("Bienvenidos a Prestcash");
        bienvenido.setFont(new Font("Algerian", Font.PLAIN, 24));

        JLabel indicador = new JLabel("Administrador/Gestor de Préstamos");
        JLabel fecha = new JLabel("Fecha");

        GroupLayout headerLayout = new GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
                headerLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(headerLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(headerLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(bienvenido)
                                        .addComponent(indicador)
                                        .addComponent(fecha))
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
                headerLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(headerLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(bienvenido)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(indicador)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fecha)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        // Diseño del fondo
        JPanel contenido = new JPanel();

        GroupLayout fondoLayout = new GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
                fondoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(fondoLayout.createSequentialGroup()
                                .addComponent(menu, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(fondoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(header, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(contenido, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)) // Aquí estaba el error, faltaba un paréntesis de cierre
                        )
        );
        fondoLayout.setVerticalGroup(
                fondoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(menu, GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
                        .addGroup(fondoLayout.createSequentialGroup()
                                .addComponent(header, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(contenido, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        // Añadir el fondo al JFrame
        frame.add(fondo);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
