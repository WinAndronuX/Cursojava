import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        String texto;
        int aux=0,igual=0;

        System.out.print("Ingrese su palindromo: ");
        texto= input.nextLine();

        for(int i = texto.length()-1; i>=0; i--){
            if(texto.charAt(i) == texto.charAt(aux)){
                igual++;
            }
            aux++;
        }
        if (texto.length()==igual){
            System.out.println("Es palindromo");
        }
        else{
            System.out.println("No es palindromo");
        }
    }
}
