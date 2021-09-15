import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        String cad1="Hola que tal ";
        String cad2;

        System.out.print("Ingrese su nombre: ");
        cad2= input.nextLine();

        System.out.println(cad1.concat(cad2));
    }
}
