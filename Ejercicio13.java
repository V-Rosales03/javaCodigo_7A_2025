
public class Ejercicio13 {
    public static void main(String[] args) {
        String mes = "abril";
        switch (mes.toLowerCase()) {
            case "abril": case "junio": case "septiembre": case "noviembre":
                System.out.println(mes + " tiene 30 días");
                break;
            case "febrero":
                System.out.println(mes + " tiene 28 días");
                break;
            case "enero": case "marzo": case "mayo": case "julio":
            case "agosto": case "octubre": case "diciembre":
                System.out.println(mes + " tiene 31 días");
                break;
            default:
                System.out.println("Mes inválido");
        }
    }
}
