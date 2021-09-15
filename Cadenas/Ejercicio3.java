public class Ejercicio3 {
    public static void main(String[] args) {
        String cadena ="Arturo";
        String cadena1=" ";

        cadena1=String.copyValueOf(cadena.toCharArray());

        System.out.println(cadena1);
    }
}
