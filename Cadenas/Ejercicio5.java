import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        String cadena,cadena0;

        System.out.print("Escriba la primer cadena: ");
        cadena= input.nextLine();
        System.out.print("Escriba la segunda cadena: ");
        cadena0= input.nextLine();

        if (cadena.equals(cadena0)){
            System.out.println("Ambas cadenas son iguales.");
        }
        else {
            System.out.println("Las cadenas son diefrentes.");
        }
    }
}
