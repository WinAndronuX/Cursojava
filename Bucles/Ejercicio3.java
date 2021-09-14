public class Ejercicio3 {
    public static void main(String[] args) {
        int sum=0,cuadrado;

        for(int i=0;i<10;i++){
            cuadrado= i*i;
            sum=sum+cuadrado;
        }

        System.out.print("La suma de los valores es: "+sum);
    }
}
