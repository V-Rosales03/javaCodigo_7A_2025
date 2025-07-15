
import java.util.Random;

public class Ejercicio19 {
    public static void main(String[] args) {
        Random rand = new Random();
        int suma = 0;
        for (int i = 0; i < 10; i++) {
            int num = rand.nextInt(100) + 1;
            suma += num;
            System.out.println("Número: " + num);
        }
        System.out.println("Suma: " + suma);
        System.out.println("Promedio: " + (suma / 10.0));
    }
}
