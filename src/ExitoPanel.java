import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExitoPanel {

    public void mostrar() {
        // Creación del JFrame principal
        JFrame frame = new JFrame("Éxito");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(300, 150);

        // Panel principal
        JPanel panelExito = new JPanel();
        panelExito.setBackground(Color.WHITE);
        panelExito.setPreferredSize(new Dimension(250, 71));

        // Configuración del botón
        JButton btnAceptarExito = new JButton("Aceptar");
        btnAceptarExito.setBackground(new Color(204, 204, 204));
        btnAceptarExito.setFont(new Font("Arial", Font.BOLD, 12));
        btnAceptarExito.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Acción cuando el botón es presionado
                System.exit(0); // Cerrar la aplicación
            }
        });

        // Etiqueta con el mensaje de éxito
        JLabel labelExito = new JLabel("Operación realizada con éxito.");
        labelExito.setFont(new Font("Arial", Font.PLAIN, 14));

        // Icono de éxito
        JLabel iconoExito = new JLabel("✅");
        iconoExito.setForeground(new Color(0, 153, 0));

        // Diseño del panel con los componentes
        GroupLayout panelLayout = new GroupLayout(panelExito);
        panelExito.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
                panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(panelLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(btnAceptarExito)
                                        .addGroup(panelLayout.createSequentialGroup()
                                                .addComponent(iconoExito)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(labelExito, GroupLayout.PREFERRED_SIZE, 197, GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(14, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
                panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                                .addContainerGap(15, Short.MAX_VALUE)
                                .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(labelExito)
                                        .addComponent(iconoExito))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnAceptarExito)
                                .addContainerGap())
        );

        // Añadir el panel al JFrame
        frame.add(panelExito, BorderLayout.CENTER);

        // Hacer visible la ventana
        frame.setVisible(true);
    }
}