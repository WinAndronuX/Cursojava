import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int num;

        System.out.print("Ingrese un numero: ");
        num= input.nextInt();

        if (num%2==0){
            System.out.println("Es par");
        }
        else{
            System.out.println("Es impar");
        }
    }
}
