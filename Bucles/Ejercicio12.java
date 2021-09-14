import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner inpu=new Scanner(System.in);

        int n,a=0,b=1,c=1;

        System.out.print("Ingrese un valor: ");
        n= inpu.nextInt();

        for (int i=1;i<n;i++){
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }
}
