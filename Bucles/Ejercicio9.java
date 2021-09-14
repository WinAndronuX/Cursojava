import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int n,sum=0,fact=1;

        System.out.print("Ingresa hasta donde quieres llegar: ");
        n= input.nextInt();

        for(int i=1; i<=n; i++){

            fact *= i;
            sum += fact;
        }

        System.out.println( "La suma de numeros factoriales es: "+sum);
    }
}
