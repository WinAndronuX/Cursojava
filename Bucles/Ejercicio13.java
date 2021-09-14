import java.util.Scanner;
import java.util.Random;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Random alea = new Random();

        int n,numAl,cont=0;

        numAl= alea.nextInt(100)+1;

        do {
            System.out.print("Ingrese un numero: ");
            n= input.nextInt();

            if(n>numAl){
                System.out.println("Menos");
            }
            else
                if(n<numAl){
                    System.out.println("Mas");
                }

            cont ++;
        }while (n!= numAl);

        System.out.println("¡¡Adivinaste el numero!!");
        System.out.println("Numero de intentos: "+cont);
    }
}
