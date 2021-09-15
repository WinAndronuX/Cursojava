import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int num, u,d,c,m;

        System.out.print("Ingese un numero: ");
        num= input.nextInt();

        u = num%10; num /=10;
        d = num%10; num /=10;
        c = num%10; num /=10;
        m = num%10; num /=10;

        switch(m){
            case 1:
                System.out.println("M");
                break;
            case 2: System.out.println("MM");
                break;
            case 3: System.out.println("MMM");
                break;
        }

        switch(c){
            case 1: System.out.println("C");
                break;
            case 2: System.out.println("CC");
                break;
            case 3: System.out.println("CCC");
                break;
            case 4: System.out.println("CD");
                break;
            case 5: System.out.println("D");
                break;
            case 6: System.out.println("DC");
                break;
            case 7: System.out.println("DCC");
                break;
            case 8: System.out.println("DCCC");
                break;
            case 9: System.out.println("CM");
                break;
        }

        switch(d){
            case 1: System.out.println("X");
                break;
            case 2: System.out.println("XX");
                break;
            case 3: System.out.println("XXX");
                break;
            case 4: System.out.println("XL");
                break;
            case 5: System.out.println("L");
                break;
            case 6: System.out.println("LX");
                break;
            case 7: System.out.println("LXX");
                break;
            case 8: System.out.println("LXXX");
                break;
            case 9: System.out.println("XC");
                break;
        }

        switch(u){
            case 1: System.out.println("I");
                break;
            case 2: System.out.println("II");
                break;
            case 3: System.out.println("III");
                break;
            case 4: System.out.println("IV");
                break;
            case 5: System.out.println("V");
                break;
            case 6: System.out.println("VI");
                break;
            case 7: System.out.println("VII");
                break;
            case 8: System.out.println("VIII");
                break;
            case 9: System.out.println("IX");
                break;
        }
    }
}
