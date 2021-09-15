import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        String letra;
        char xd;
        int aux;


        System.out.print("Ingresa una vocal: ");
        letra= input.nextLine();
        xd=letra.toCharArray()[0];
        aux=(int)xd;

        if(aux == 97 || aux ==101 || aux == 105 || aux == 111 || aux == 117){
            System.out.println("Es una vocal minuscula");
        }else
            if(aux == 65 || aux == 69 || aux == 73 || aux == 79 || aux == 85){
                System.out.println("Es una vocal mayuscula");
            }
            else{
            System.out.println("No es una vocal");
        }
    }
}
