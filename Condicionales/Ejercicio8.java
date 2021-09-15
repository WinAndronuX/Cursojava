import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int num1,num2,num3;
        int extra;

        System.out.print("Ingrese 3 numeros: ");
        num1= input.nextInt();
        num2= input.nextInt();
        num3= input.nextInt();

        System.out.println("Ingresa otro numero: ");
        extra= input.nextInt();

        if(extra == num1 || extra == num2 || extra == num3){
            System.out.println("El ultimo numero ingresado coincide con alguno de los primeros 3");
        }
        else{
            System.out.println("El ultimo numero ingresado no coincide con alguno de los 3 primeros");
        }
    }
}
