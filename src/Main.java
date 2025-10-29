package src;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Pago pago;

        System.out.println("=== SISTEMA DE PAGOS ===");
        System.out.println("Seleccione el método de pago:");
        System.out.println("1. Tarjeta");
        System.out.println("2. PayPal");
        System.out.println("3. Criptomonedas");
        System.out.print("Opción: ");
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                pago = new PagoTarjeta();
                break;
            case 2:
                pago = new PagoPayPal();
                break;
            case 3:
                pago = new PagoCripto();
                break;
            default:
                System.out.println(" Opción no válida. Se usará pago con tarjeta por defecto.");
                pago = new PagoTarjeta();
        }

        System.out.println("\n---- PROCESANDO PAGO ----");
        pago.procesarPago();

        sc.close();
    }
}
