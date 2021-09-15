import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        String letra;

        System.out.print("Ingresa una vocal: ");
        letra= input.nextLine();


        switch (letra.charAt(0)){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("La vocal es minuscula.");
                break;
            default:
                System.out.println("La vocal es mayuscula");
        }
    }
}
