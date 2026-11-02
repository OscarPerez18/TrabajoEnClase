
package main;

import controlador.ControladorRecursos;
import modelo.GestionRecursos;
import vista.VistaPrincipal;

public class Principal {

    public static void main(String[] args) {
        VistaPrincipal vista = new VistaPrincipal();

        GestionRecursos gestion = new GestionRecursos();

        ControladorRecursos controlador = new ControladorRecursos(vista, gestion);
        
        vista.setVisible(true);
        
    }
}
