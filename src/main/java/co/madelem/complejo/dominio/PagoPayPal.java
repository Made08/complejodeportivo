package co.madelem.complejo.dominio;

public class PagoPayPal extends Pago {
    @Override
    public String procesarPago(double monto) {
        return "Pago con PayPal procesado por el monto de: " + monto;
    }
}