//16.4 String[] intruccion está dentro del metodo ejecutar que se supone que contiene instruccion para ejecutar acciones en la instancia de OficinaPadron
//17.1 Paquete: mecanismo de organización y agrupación de clases, interfaces y otros elementos relacionados en un espacio de nombres específico.

package presentacion;
import comprobaciones.Comprobacion;
import dominio.OficinaPadron;
import dominio.Habitante;
import java.util.ArrayList;
public class InterfazUsuario{
    public static void ejecutar(String[] instruccion){
        OficinaPadron padron = new OficinaPadron();
        if (instruccion[0].equalsIgnoreCase("mostrar") &&
        instruccion.length == 1){
            mostrarOficinaPadron(padron);
        }else if (instruccion[0].equalsIgnoreCase("anadir")
        && instruccion.length == 4){
            padron.annadir(new Habitante(instruccion[1],
            instruccion[2], instruccion[3]));
            System.out.println("Habitante añadido correctamente");
        }else{System.out.println("Error en la instrucción");
        }
    }
    private static void mostrarOficinaPadron(OficinaPadron padron){
        ArrayList<Habitante> habitantes = padron.getHabitantesPadron();
        for(Habitante habitante : habitantes){
            System.out.println(habitante.getNombre() + " "
            +habitante.getApellido1() + " " 
            +habitante.getApellido2());
        }
        System.out.println("El numero total de habitantes es " 
        + padron.calcularNumeroHabitantes());
    }
}


/*/ 15.1
import java.util.ArrayList;
public class InterfazUsuario{
    public static void ejecutar(String instruccion){
        OficinaPadron padron = new OficinaPadron();
        if (instruccion.equalsIgnoreCase("mostrar")){
            mostrarOficinaPadron(padron);
        }else{
            System.out.println("Error en la instrucción");
        }
    }
    private static void mostrarOficinaPadron(OficinaPadron padron){
        ArrayList<Habitante> habitantes = padron.getHabitantesPadron();
        for(Habitante habitante : habitantes){
            System.out.println(habitante.getNombre() + " " +
            habitante.getApellido1() + " " + 
            habitante.getApellido2());
        }
        System.out.println("El numero total de habitantes es" + padron.calcularNumeroHabitantes());
    }
}
/*/