import java.util.Scanner;

public class Cadenas {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        
        System.out.print("Ingrese su nombre: ");
        String nombre= consola.nextLine();

        System.out.println("Su nombre es: " + nombre);
    }    
}
