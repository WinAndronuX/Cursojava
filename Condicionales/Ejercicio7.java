import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int edad;

        System.out.print("Ingrese su edad: ");
        edad= input.nextInt();

        if(edad>=18&&edad<=25){
            System.out.println("Estas en el rango de edad");
        }
        else {
            System.out.println("No estas en el rango de edad");
        }
    }
}
