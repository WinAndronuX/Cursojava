import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        String cadena,cadena0;

        System.out.print("Escriba algo: ");
        cadena= input.nextLine();

        cadena0=String.copyValueOf(cadena.toCharArray());

        System.out.println("Lo que escribio fue: " + cadena0);
    }
}
