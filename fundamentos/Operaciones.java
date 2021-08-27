import java.util.Scanner;

public class Operaciones {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        int num,num1;
        int sum=0,res=0,mult=0,div=0;

        System.out.println("Ingrese el primer valor: ");
        num = consola.nextInt();
        System.out.println("Ingrese otro valor: ");
        num1 = consola.nextInt();

        sum=num+num1;
        res=num-num1;
        mult=num*num1;
        div=num/num1;

        System.out.println("El resultado de "+num+"+" + num1 + " es igual a: "+sum);
        System.out.println("El resultado de "+num+"-" + num1 + " es igual a: "+res);
        System.out.println("El resultado de "+num+"x" + num1 + " es igual a: "+mult);
        System.out.println("El resultado de "+num+"/" + num1 + " es igual a: "+div);
    }
}
