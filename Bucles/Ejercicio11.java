import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int n,par=0,impar=0,negativo=0,suma=0;

        System.out.print("Ingrese el numero: ");
        n=input.nextInt();

        for(int i=1; i<=n; i++){
            if(i%2==0){
                negativo = i * -1;
                par += negativo;
            }else{
                impar += i;
            }

        }

        suma=par +impar;
        System.out.println(suma);
    }
}
