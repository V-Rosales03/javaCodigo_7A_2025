
public class Ejercicio12 {
    public static void main(String[] args) {
        int numero = 15;
        if (numero >= 1 && numero <= 12) {
            System.out.println("Primera docena");
        } else if (numero >= 13 && numero <= 24) {
            System.out.println("Segunda docena");
        } else if (numero >= 25 && numero <= 36) {
            System.out.println("Tercera docena");
        } else {
            System.out.println("Fuera de rango");
        }
    }
}
