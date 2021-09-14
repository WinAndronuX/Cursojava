/*Solicitar numero y cuando entre un cero
se detiene el programa y te mostrar los datos ingresados
*/

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        int num,i=0;
        int aux[] = new int [100];

        do{
            System.out.print("Ingrese un numero: ");
            num= input.nextInt();
            aux[i]=num;
            i++;
        }while(num != 0);

        System.out.println("\n\n");

        System.out.print("Numeros Ingresados: ");
        for(int j=0;j<i-1;j++){
            if(j==i-2) {
                System.out.print(aux[j] + ".");
            }
            else
                System.out.print(aux[j] + ",");
        }
    }
}
