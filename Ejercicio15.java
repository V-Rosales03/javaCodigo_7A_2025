
public class Ejercicio15 {
    public static void main(String[] args) {
        char clase = 'c';
        switch (clase) {
            case 'a':
                System.out.println("4 ruedas y un motor");
                break;
            case 'b':
                System.out.println("4 ruedas, un motor, cierre centralizado y aire");
                break;
            case 'c':
                System.out.println("4 ruedas, un motor, cierre centralizado, aire, airbag");
                break;
            default:
                System.out.println("Clase inválida");
        }
    }
}
