import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int n,fact=1;

        System.out.print("Ingresa el numero factorial que quieras: ");
        n= input.nextInt();

        for(int i=1; i<=n; i++){
            fact *= i;
        }

        System.out.println("Resultado: "+fact);
    }
}
