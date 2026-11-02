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
public class RecursoMultimedia {
    //Atributos 
private int codigoUnico;
private String nombre;
private String tipoRecurso;
private double duracionSize;

//Constructor con parametros 

    public RecursoMultimedia(int codigoUnico, String nombre, String tipoRecurso, double duracionSize) {
        this.codigoUnico = codigoUnico;
        this.nombre = nombre;
        this.tipoRecurso = tipoRecurso;
        this.duracionSize = duracionSize;
    }//fin del constructor 
    
<<<<<<< HEAD
    private ArrayList<RecursoMultimedia> recurso = new ArrayList<>();
    
}
=======
    
    //Getters and Setters

    public int getCodigoUnico() {
        return codigoUnico;
    }//fin getCodigoUnico

    public void setCodigoUnico(int codigoUnico) {
        this.codigoUnico = codigoUnico;
    }//fin setCodigoUnico

    public String getNombre() {
        return nombre;
    }//fin getNombre

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }//fin setNombre

    public String getTipoRecurso() {
        return tipoRecurso;
    }//fin getTipoRecurso

    public void setTipoRecurso(String tipoRecurso) {
        this.tipoRecurso = tipoRecurso;
    }//fin setTipoRecurso

    public double getDuracionSize() {
        return duracionSize;
    }//fin getDuracionSize

    public void setDuracionSize(double duracionSize) {
        this.duracionSize = duracionSize;
    }//fin setDuracionSize
    
    
    //Método para mostrar información 
     public String toString(){
         return "Código: " + codigoUnico 
                 + "\nNombre: " + nombre 
                 + "\nTipo de Recurso: " + tipoRecurso 
                 + "\nDuración/Tamaño: " + duracionSize;
         
     }//fin de toString  
             
    


}// fin de la clase RecursoMultimedia 
>>>>>>> 4fbec7203e684ba79f393ff37f8943a8ec167765
