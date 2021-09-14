import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        int num;

        do {
            System.out.print("Ingrese un numero de1 1 al 10: ");
            num = input.nextInt();
        }while(num<1&&num>=10);


        for(int i=1;i<=10;i++){
            System.out.println(num+" x "+i+" = "+(num*i));
        }
    }
}
