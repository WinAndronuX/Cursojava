import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int n,sum=0,potencia=1;

        System.out.print("Ingresa el valor limite: ");
        n= input.nextInt();

        for(int i=1; i<=n; i++){
            potencia = (int)Math.pow(2,i);
            sum += potencia;
        }

        System.out.println("Total: "+sum);
    }
}
