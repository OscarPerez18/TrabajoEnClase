/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import javax.swing.JOptionPane;
import modelo.*;
import vista.VistaPrincipal;

/**
 *
 * @author blood
 */
public class ControladorRecursos {
    
    private VistaPrincipal vista;
    private GestionRecursos gestion;

    public ControladorRecursos(VistaPrincipal vista,
                               GestionRecursos gestion) {

        this.vista = vista;
        this.gestion = gestion;

        iniciarEventos();
    }

    private void iniciarEventos() {

        vista.getBtnRegistrar().addActionListener(e -> registrar());
        vista.getBtnMostrar().addActionListener(e -> mostrar());
        vista.getBtnBuscar().addActionListener(e -> buscar());
        vista.getBtnModificar().addActionListener(e -> modificar());
        vista.getBtnEliminar().addActionListener(e -> eliminar());
        vista.getBtnSalir().addActionListener(e -> salir());
    }

    // REGISTRAR RECURSO
    private void registrar() {

        try {
            int codigo = Integer.parseInt(
                JOptionPane.showInputDialog("Ingrese el código:")
            );

            String nombre = JOptionPane.showInputDialog(
                "Ingrese el nombre:"
            );

            String tipo = JOptionPane.showInputDialog(
                "Ingrese el tipo (imagen, audio, video o animación):"
            );

            double valor = Double.parseDouble(
                JOptionPane.showInputDialog(
                    "Ingrese la duración o tamaño:"
                )
            );

            RecursoMultimedia recurso =
                new RecursoMultimedia(codigo, nombre, tipo, valor);

            if (gestion.registrarRecurso(recurso)) {
                JOptionPane.showMessageDialog(
                    vista, "Recurso registrado correctamente."
                );
            } else {
                JOptionPane.showMessageDialog(
                    vista, "El código ya existe."
                );
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(
                vista, "Ingrese valores numéricos válidos."
            );
        }
    }

    // MOSTRAR RECURSOS
    private void mostrar() {

        StringBuilder resultado = new StringBuilder();

        for (RecursoMultimedia r : gestion.getRecursos()) {

            resultado.append("Código: ").append(r.getCodigoUnico())
                     .append("\nNombre: ").append(r.getNombre())
                     .append("\nTipo: ").append(r.getTipoRecurso())
                     .append("\nDuración/Tamaño: ")
                     .append(r.getDuracionSize())
                     .append("\n-------------------------\n");
        }

        if (resultado.length() == 0) {
            resultado.append("No hay recursos registrados.");
        }

        JOptionPane.showMessageDialog(vista, resultado.toString());
    }

    // BUSCAR RECURSO
    private void buscar() {

        try {
            int codigo = Integer.parseInt(
                JOptionPane.showInputDialog("Ingrese el código a buscar:")
            );

            RecursoMultimedia r = gestion.buscarRecurso(codigo);

            if (r != null) {
                JOptionPane.showMessageDialog(
                    vista,
                    "Código: " + r.getCodigoUnico()
                    + "\nNombre: " + r.getNombre()
                    + "\nTipo: " + r.getTipoRecurso()
                    + "\nDuración/Tamaño: " + r.getDuracionSize()
                );
            } else {
                JOptionPane.showMessageDialog(
                    vista, "Recurso no encontrado."
                );
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(
                vista, "Código inválido."
            );
        }
    }

    // MODIFICAR RECURSO
    private void modificar() {

        try {
            int codigo = Integer.parseInt(
                JOptionPane.showInputDialog("Ingrese el código a modificar:")
            );

            RecursoMultimedia r = gestion.buscarRecurso(codigo);

            if (r != null) {

                String nombre = JOptionPane.showInputDialog(
                    "Nuevo nombre:", r.getNombre()
                );

                String tipo = JOptionPane.showInputDialog(
                    "Nuevo tipo:", r.getTipoRecurso()
                );

                r.setNombre(nombre);
                r.getTipoRecurso(tipo);

                JOptionPane.showMessageDialog(
                    vista, "Recurso modificado correctamente."
                );

            } else {
                JOptionPane.showMessageDialog(
                    vista, "Recurso no encontrado."
                );
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(
                vista, "Código inválido."
            );
        }
    }

    // ELIMINAR RECURSO
    private void eliminar() {

        try {
            int codigo = Integer.parseInt(
                JOptionPane.showInputDialog("Ingrese el código a eliminar:")
            );

            if (gestion.eliminarRecurso(codigo)) {
                JOptionPane.showMessageDialog(
                    vista, "Recurso eliminado correctamente."
                );
            } else {
                JOptionPane.showMessageDialog(
                    vista, "Recurso no encontrado."
                );
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(
                vista, "Código inválido."
            );
        }
    }

    // SALIR
    private void salir() {

        int opcion = JOptionPane.showConfirmDialog(
            vista,
            "¿Desea salir del sistema?",
            "Confirmar salida",
            JOptionPane.YES_NO_OPTION
        );

        if (opcion == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }
    
}
