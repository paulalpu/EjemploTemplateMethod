package src;
public class PagoPayPal extends Pago {

    @Override
    protected void conectarServicio() {
        System.out.println("Conectando a la API de PayPal...");
    }

    @Override
    protected void validarDatos() {
        System.out.println("Verificando cuenta PayPal del usuario...");
    }

    @Override
    protected boolean realizarPago() {
        System.out.println("Realizando transacción con PayPal...");
        return true; // simulación pago exitoso
    }
}
