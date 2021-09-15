import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int num1,num2,num3;

        System.out.print("Ingrese 3 numeros: ");
        num1= input.nextInt();
        num2= input.nextInt();
        num3= input.nextInt();

        if((num1>num2)&& (num1>num3)){
            System.out.println("El mayor es: "+num1);
        }else if((num2 > num1) && (num2 > num3)){
            System.out.println("El mayor es: "+num2);
        }else if((num3>num1) && (num3>num2)){
            System.out.println("El mayor es: "+num3);
        }
    }
}
