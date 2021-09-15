import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int num;

        System.out.print("Ingrese un numero: ");
        num= input.nextInt();

        if (num<0){
            System.out.println("El numero es negativo");
        }
        else{
            System.out.println("El numero es positivo");
        }
    }
}
