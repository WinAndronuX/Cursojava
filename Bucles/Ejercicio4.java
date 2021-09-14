import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int num,sum=0;

        do {
            System.out.print("Ingresa un numero: ");
            num= input.nextInt();
            if(num>0){
                sum=sum+num;
            }
        }while ((num<20 || num>30)&&num!=0);

        System.out.println("La suma de los numeros es: " + sum);
    }
}
