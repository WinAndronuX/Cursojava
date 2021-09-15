import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        String cad1,cad2;
        int num1;
        float num2,suma;

        System.out.print("Ingrese un valor numerico: ");
        cad1= input.nextLine();
        System.out.print("Ingrese un valor decimal: ");
        cad2= input.nextLine();

        num1=Integer.parseInt(cad1);
        num2= Float.parseFloat(cad2);
        suma=num1+num2;

        System.out.println("La suma de los valores es: " + suma);
    }
}
