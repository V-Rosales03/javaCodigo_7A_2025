
public class Ejercicio21 {
    public static void main(String[] args) {
        char categoria = 'B';
        int antiguedad = 7;
        double sueldo = 50000;
        double aumento = 0;

        if (antiguedad >= 1 && antiguedad <= 5) aumento = sueldo * 0.05;
        else if (antiguedad >= 6 && antiguedad <= 10) aumento = sueldo * 0.10;
        else if (antiguedad > 10) aumento = sueldo * 0.30;

        int plus = switch (categoria) {
            case 'A' -> 1000;
            case 'B' -> 2000;
            case 'C' -> 3000;
            default -> 0;
        };

        double sueldoNeto = sueldo + aumento + plus;
        System.out.println("Sueldo neto: " + sueldoNeto);
    }
}
