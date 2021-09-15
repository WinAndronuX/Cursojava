import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Ingrese una cadena de caracteres: ");
        String cadena= in.nextLine();;
        int len= cadena.length();
        if (len>10)
            System.out.println("\n\n"+cadena);
    }
}
