
public class Ejercicio17a {
    public static void main(String[] args) {
        int[] numeros = {4, 5, 6};
        int suma = 0;
        for (int num : numeros) {
            if (num % 2 == 0) {
                suma += num;
            }
        }
        System.out.println("Suma de pares: " + suma);
    }
}
