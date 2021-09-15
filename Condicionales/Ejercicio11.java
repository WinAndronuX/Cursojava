import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int SaldoIn=1000;
        int opc;
        float extra,saldo=0,retirar;

        System.out.println("\tBienvenido al Cajero\n");
        System.out.println("1.- Ingresar dinero\n2.- Retirar dinero\n3.- Salir");
        System.out.print("\n    >");
        opc= input.nextInt();

        switch (opc){
            case 1:
                System.out.print("Ingrese la cantidad de dinero a ingresar: ");
                extra= input.nextFloat();
                saldo=SaldoIn+extra;
                System.out.println("Dinero en la cuenta: "+saldo);
                break;
            case 2:
                System.out.print("Ingrese la cantidad de dinero a retirar: ");
                retirar= input.nextFloat();
                if (retirar>SaldoIn){
                    System.out.println("No tiene suficiente saldo");
                }
                else {
                    saldo=SaldoIn-retirar;
                    System.out.println("Dinero en la cuenta: "+saldo);
                }
                break;
            case 3:
                break;
        }
    }
}
