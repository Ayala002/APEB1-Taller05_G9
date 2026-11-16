
/**
 * Ejercicio 02: "Día de la semana: Mostrar el nombre del día de la semana en
 * función del número ingresado (1 para lunes, 2 para martes, etc.)."
 * @author NombreAutor Alex Ayala
 * @version 1.0
 */
import java.util.Scanner;

public class Ejercicio02_Diasemana {
    public static void main(String[] args) {
        String nombreDia;
        Scanner tcl = new Scanner(System.in);
        System.out.print("Deme nro. de dia: ");
        int nroDia = tcl.nextInt();
        nombreDia = switch (nroDia) {
            case 1 -> "lunes";
            case 2 -> "martes";
            case 3 -> "miercoles";
            default -> "error";
        };
        System.out.println(nombreDia);
    }
}

                
  

/***
 * EVIDENCIA DEL RUN:
 * Deme edad: 
 *23
 *Es legible para votar
 */