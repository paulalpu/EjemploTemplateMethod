package src;
public class PagoCripto extends Pago {

    @Override
    protected void conectarServicio() {
        System.out.println("Conectando a la red blockchain...");
    }

    @Override
    protected void validarDatos() {
        System.out.println("Verificando dirección de la billetera digital...");
    }

    @Override
    protected boolean realizarPago() {
        System.out.println("Procesando transacción en blockchain...");
        return false; // simulación de error 
    }
}

