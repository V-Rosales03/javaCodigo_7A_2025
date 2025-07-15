
public class Ejercicio17b {
    public static void main(String[] args) {
        int[] numeros = {4, 5, 6};
        int suma = 0;
        for (int num : numeros) {
            suma += num * (1 - num % 2); // num si par, 0 si impar
        }
        System.out.println("Suma de pares sin if: " + suma);
    }
}
