

package comprobaciones;
import dominio.Habitante;
import dominio.OficinaPadron;
import presentacion.InterfazUsuario;

import java.util.ArrayList;
public class Comprobacion{
    public static void realizarComprobacion(){
        OficinaPadron padron = new OficinaPadron();
        ArrayList<Habitante> habitantes = padron.getHabitantesPadron();
        for(Habitante habitante : habitantes){
            System.out.println(habitante.getNombre() + " " 
            +habitante.getApellido1() + " " 
            +habitante.getApellido2());
        }
        System.out.println("El numero total de habitantes es " + padron.calcularNumeroHabitantes());
    }
}






/*/import java.util.ArrayList;
public class Comprobacion{
    public static void realizarComprobacion(){
        Habitante habitante1 = new Habitante("Juan", "Torres", "Sanz");
        Habitante habitante2 = new Habitante("Marta","Caballero","Ramos");
        OficinaPadron padron = new OficinaPadron();
        padron.annadir(habitante1);
        padron.annadir(habitante2);
        ArrayList<Habitante> habitantes = padron.getHabitantesPadron();
        for(Habitante habitante : habitantes){
            System.out.println(habitante.getNombre() + " "
            +habitante.getApellido1() + " " 
            +habitante.getApellido2());
        }
        
        System.out.println("El numero total de habitantes es " + padron.calcularNumeroHabitantes());
    }
    
    
}
*/
// public class Comprobacion {
//11.4 Un metodo estático es un atributo o método que pertenece a la clase en sí misma en lugar de pertenecer a una instancia específica de esa clase 
   //  public static void realizarComprobacion()
    // {
        // Habitante habitante1 = new Habitante("Angel", "Martin", "Trejo");
        // System.out.println(habitante1.getNombre() + " " 
        // +habitante1.getApellido1() + " "
        // +habitante1.getApellido2());
        // }
        //Código de los anteriores apartados
         //habitante1.setNombre("Angel");
         //habitante1.setApellido1("Martin");
         //habitante1.setApellido2("Trejo");
         
         //System.out.println( habitante1.getNombre() + " " + 
            //habitante1.getApellido1() + " " + 
          //habitante1.getApellido2());
 
//12.3 Tienes que asignar los tres valores a las variables string de nombre apellido1 y apellido2 dentro del constructor que fue asignad en la 
//clase habitante
// }
   