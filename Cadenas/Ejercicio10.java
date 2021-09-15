import java.util.Locale;
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
            Scanner input=new Scanner(System.in);

            String word;

        System.out.print("Ingresa una palabra: ");
        word= input.nextLine();

        System.out.println(word.toUpperCase(Locale.ROOT));
    }
}
