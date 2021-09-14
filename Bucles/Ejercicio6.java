import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int num,sum=0;

        System.out.print("Ingres el numero hasta el que quiere calcular: ");
        num= input.nextInt();

        for (int i=0;i<=num;i++){
            sum += i;
        }

        System.out.println("Valor de la suma: "+sum);
    }
}
