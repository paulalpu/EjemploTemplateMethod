package src;
public class PagoTarjeta extends Pago {

    @Override
    protected void conectarServicio() {
        System.out.println("Conectando al sistema de tarjetas...");
    }

    @Override
    protected void validarDatos() {
        System.out.println("Validando número de tarjeta y saldo disponible...");
    }

    @Override
    protected boolean realizarPago() {
        System.out.println("Procesando pago con tarjeta...");
        return true; // simulación pago exitoso
    }
}
