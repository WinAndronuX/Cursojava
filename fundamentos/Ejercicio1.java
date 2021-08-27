import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner consola= new Scanner(System.in);
        
        System.out.println("Ingrese el precio del producto: ");
        int num= consola.nextInt();

        int iva = ((num/100)*16)+num;

        System.out.println("El precio del producto con iva incluido es: "+iva);
    }
}
