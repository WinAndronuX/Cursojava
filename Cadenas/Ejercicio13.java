import java.util.Locale;
import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        String name;

        System.out.print("Ingrese su nombre en mayusculas: ");
        name= input.nextLine();

        if (name.charAt(0)=='A'){
            System.out.println("Bienvenido "+name.toLowerCase(Locale.ROOT));
        }
        else {
            System.out.println("Bienvenido "+name);
        }
    }
}
