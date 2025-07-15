
import java.util.Random;

public class Ejercicio22 {
    public static void main(String[] args) {
        Random rand = new Random();
        int i = 0;
        while (i < 10) {
            char categoria = (char) ('A' + rand.nextInt(3)); // A, B, C
            int antiguedad = rand.nextInt(21);
            int sueldo = 30000 + rand.nextInt(70001);
            double aumento = antiguedad <= 5 ? sueldo * 0.05 :
                             antiguedad <= 10 ? sueldo * 0.10 : sueldo * 0.30;
            int plus = switch (categoria) {
                case 'A' -> 1000;
                case 'B' -> 2000;
                case 'C' -> 3000;
                default -> 0;
            };
            double neto = sueldo + aumento + plus;
            System.out.println("Empleado " + (i + 1) + ": " +
                "Cat " + categoria + ", Antig " + antiguedad +
                ", Sueldo " + sueldo + ", Neto " + neto);
            i++;
        }
    }
}
