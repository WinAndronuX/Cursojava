import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int num,sum=0;

        System.out.print("Ingres el numero hasta el que quiere calcular: ");
        num= input.nextInt();

        for(int i=0;i<=2*num-1;i+=2){
            sum+=i;
        }

        System.out.println("Total de los numeros: "+sum);
    }
}
