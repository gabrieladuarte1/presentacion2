/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ventanamdi;

import javax.swing.*;

public class VentanaMDI extends JFrame {

    // Panel donde se agregan las ventanas internas
    private final JDesktopPane escritorio;

    public VentanaMDI() {
        // Configurar la ventana principal
        setTitle("MDI Simple");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centrar ventana

        // Crear el escritorio (zona donde van las ventanas internas)
        escritorio = new JDesktopPane();
        add(escritorio);

        // Crear botón para abrir ventana interna
        JButton boton = new JButton("Abrir ventana interna");
        boton.setBounds(20, 20, 200, 30); // Posición dentro del escritorio
        boton.addActionListener(e -> abrirVentanaInterna());

        // Añadir el botón directamente al escritorio
        escritorio.add(boton);
    }

    // Método para crear y mostrar una ventana interna
    private void abrirVentanaInterna() {
        JInternalFrame ventana = new JInternalFrame("Ventana Interna", true, true, true, true);
        ventana.setSize(250, 150);
        ventana.setVisible(true);

        // Añadir al escritorio
        escritorio.add(ventana);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new VentanaMDI().setVisible(true);
        });
    }
}
