import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int x,y,potencia=1;

        System.out.print("Ingrese el valor de x: ");
        x= input.nextInt();
        System.out.print("Ingrese el valor de y: ");
        y= input.nextInt();

        for (int i=1;i<=y;i++){
            potencia *= x;
        }

        System.out.println("La potencia es : " + potencia);
    }
}
