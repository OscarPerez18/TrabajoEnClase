/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author blood
 */
public class GestionRecursos {
    //creacion del arraylist
    private ArrayList<RecursoMultimedia> recursos; 
 
     
    //constructor por default
    public GestionRecursos() {
        recursos = new ArrayList<>();
        recursos.add( new RecursoMultimedia(100, "Harry Potter: La Piedra Filosofal", "Video", 5.5));
    }// fin del constructor 
    
       
    //Métodos Funcionales del Programa 
    //1. Registrar recurso
    public boolean registrarRecurso(RecursoMultimedia recurso) {

        for (RecursoMultimedia r : recursos) {

            if (recurso.getCodigoUnico() == r.getCodigoUnico()) {
                return false;
            }//fin del if 
        }//fin del for 
        //añade el recurso
        recursos.add(recurso);

        return true;
        
    }//fin de registarRecurso 
    
    
    //2. Mostrar recursos
    public ArrayList<RecursoMultimedia> mostrarRecursos(){
        return recursos;
    }//fin de mostar recursos 
    
    //3. Buscar recurso
    public RecursoMultimedia buscarRecurso(int CodigoUnico){ 
             for (RecursoMultimedia r : recursos) {

            if (r.getCodigoUnico() == CodigoUnico) {
                return r;
            }//fin del if 
        }//fin del for 
             return null; 
    }//fin de recursoMultimedia 
    
    //4. Modificar recurso
    public boolean modificarRecurso(int codigoUnico,
        String nuevoNombre, String nuevoTipoRecurso){
        
        //para buscar el recurso
         RecursoMultimedia recurso = buscarRecurso(codigoUnico);
         //condicional para ver si existe el recurso 
         if( recurso != null){
             recurso.setNombre(nuevoNombre);
             recurso.setTipoRecurso(nuevoTipoRecurso);
             return true; 
         }//fin if 
         return false; 
        
    }//fin de modificarRecurso 
    
    
    //5. Eliminar recurso 
    public boolean eliminarRecurso(int codigoUnico) {
        //busca el recurso 
        RecursoMultimedia recurso = buscarRecurso(codigoUnico);
     //condicional para ver si existe el recurso 
        if (recurso != null) {
            //para eliminar el recurso 
            recursos.remove(recurso);
            return true;
        }//fin del if 

        return false;

        
    }//fin de eliminar recurso 
    
    
}//fin de la clase GestionRecursos
