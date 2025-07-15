public class Ejer10 {
    public static void main(String[] args) {
        int a = 2, b = 7, c = 5;
        int mayor = (a >= b && a >= c) ? a : (b >= c ? b : c);
        System.out.println("Mayor: " + mayor);
    }
}
