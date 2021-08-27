import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        System.out.println("Ingrese un numero: ");
        Scanner consola = new Scanner(System.in);
        String dato = consola.nextLine();
        System.out.println("El dato que usted ingreso es: "+ dato);
    }
}
