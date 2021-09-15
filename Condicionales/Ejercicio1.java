import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int num,num1;

        System.out.print("Ingresa el primer numero: ");
        num= input.nextInt();
        System.out.print("Ingresa el segundo numero: ");
        num1= input.nextInt();

        if(num==num1){
            System.out.println("Los numeros son iguales");
        }
        else
            if (num>num1){
                System.out.println("El numero "+num+" es mayor que "+num1);
            }
            else {
                System.out.println("El numero "+num1+" es mayor que "+num);
            }
    }
}
