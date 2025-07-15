
import java.util.Random;

public class Ejercicio20 {
    public static void main(String[] args) {
        Random rand = new Random();
        int i = 0, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        do {
            int num = rand.nextInt(100) + 1;
            if (num > max) max = num;
            if (num < min) min = num;
            System.out.println("Número: " + num);
            i++;
        } while (i < 10);
        System.out.println("Máximo: " + max);
        System.out.println("Mínimo: " + min);
    }
}
