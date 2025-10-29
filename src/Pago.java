package src;
public abstract class Pago {

    public final void procesarPago() {
        conectarServicio();
        validarDatos();

        if (realizarPago()) {
            mostrarExito();
        } else {
            mostrarError();
        }

        desconectarServicio();
    }

    // Métodos abstractos 
    protected abstract void conectarServicio();
    protected abstract void validarDatos();
    protected abstract boolean realizarPago();

    // Métodos concretos 
    protected void mostrarExito() {
    System.out.println("[OK] Pago realizado con éxito.");
}

protected void mostrarError() {
    System.out.println("[ERROR] Error al procesar el pago.");
}

protected void desconectarServicio() {
    System.out.println("[INFO] Desconectando del servicio de pago.");
}

}
