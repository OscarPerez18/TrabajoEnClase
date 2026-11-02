package main;

<<<<<<< HEAD
import controlador.ControladorRecursos;
import modelo.GestionRecursos;
=======
>>>>>>> 2d79459905fdfc41fc1ad181d35bed595b74df6a
import vista.VistaPrincipal;

public class Principal {

    public static void main(String[] args) {
<<<<<<< HEAD
        VistaPrincipal vista = new VistaPrincipal();

        GestionRecursos gestion = new GestionRecursos();

        ControladorRecursos controlador = new ControladorRecursos(vista, gestion);
        
        vista.setVisible(true);
        
    }
}
=======
        VistaPrincipal ventana = new VistaPrincipal();
        ventana.setVisible(true);
    }//fin del main 
}//fin de la clase principal 
>>>>>>> 2d79459905fdfc41fc1ad181d35bed595b74df6a
