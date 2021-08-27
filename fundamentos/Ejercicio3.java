import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner consola= new Scanner(System.in);

        int edad;
        String name;
        float alt;

        System.out.println("Ingrese su nombre:");
        name= consola.nextLine();
        System.out.println("Ingrese su edad: ");
        edad= consola.nextInt();
        System.out.println("Ingrese su altura: ");
        alt= consola.nextFloat();

        System.out.println("\n\nNombre: "+name);
        System.out.println("Edad: "+edad);
        System.out.println("Altura: "+alt);

    }    
}
