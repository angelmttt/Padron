/**
 * Write a description of class Habitante here.
 * 
 * @author Angel Martin Trejo
 * @version 1
 */

 //10.2 Este programa recoge tipos los cuales son asignados por una tercera persona añadiendo 3 variables string(nombre apellido y apellido2) para al ejecutarlo 
 // aparezca esas variables con el valor que se le asigna.
package dominio;
import  comprobaciones.Comprobacion;
import presentacion.InterfazUsuario;

public class Habitante
 {
      private String nombre;
      private String apellido1;
      private String apellido2;
      
     void setNombre(String nombreHabitante){
         this.nombre = nombreHabitante;
        }
     void setApellido1(String apellido1Habitante){
            this.apellido1 = apellido1Habitante;
        }
     void setApellido2(String apellido2Habitante){
            this.apellido2 = apellido2Habitante;
        }
    

     public String getNombre(){
         return nombre;
     }
     public String getApellido1(){
         return apellido1;
     }
     public String getApellido2(){
         return apellido2;
     }
     public Habitante(String nombre, String apellido1, String apellido2){
         this.nombre = nombre;
         this.apellido1 = apellido1;
         this.apellido2 = apellido2;
        }
     
}
 
  

