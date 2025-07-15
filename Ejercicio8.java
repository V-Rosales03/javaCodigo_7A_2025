
public class Ejercicio8 {
    public static void main(String[] args) {
        int j1 = 0, j2 = 2;
        if (j1 == j2) {
            System.out.println("Empate");
        } else if ((j1 == 0 && j2 == 2) || (j1 == 1 && j2 == 0) || (j1 == 2 && j2 == 1)) {
            System.out.println("Jugador 1 gana");
        } else {
            System.out.println("Jugador 2 gana");
        }
    }
}
