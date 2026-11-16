import java.util.Scanner;

public class Ejercicio03_Nmayor {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);

        System.out.print("Ingrese tres numeros: ");
        int num1 = tcl.nextInt(), num2 = tcl.nextInt(), num3 = tcl.nextInt(), mayor;

        if (num1 > num2) {
            mayor = num1;
        } else {
            mayor = num2;
        }
        if (num3 > mayor) {
            mayor = num3;
        }
        System.out.println("El numero mayor es: " + mayor);
    }
}