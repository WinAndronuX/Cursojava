import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int opc;
        double num,res;

        System.out.println("\tBienvenido\n");
        System.out.println("1.- Calcular el cubo\n2.- Numero par o impar\n3.- Salir\n");
        System.out.print("  >>");
        opc= input.nextInt();

        switch (opc){
            case 1:
                System.out.print("Ingrese un numero: ");
                num= input.nextInt();
                res=Math.pow(num,3);
                System.out.println("El cubo de "+num+" es igual a: "+res);
                break;
            case 2:
                System.out.print("Ingrese un numero: ");
                num= input.nextInt();
                if (num%2==0){
                    System.out.println("el numero "+num+" es par");
                }
                else{
                    System.out.println("el numero "+num+" es impar");
                }
                break;
            case 3:
                break;
        }
    }
}
