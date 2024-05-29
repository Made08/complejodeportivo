package co.madelem.complejo.dominio;

public class PagoTarjeta extends Pago {
    @Override
    public String procesarPago(double monto) {
        return "Pago con tarjeta procesado por el monto de: " + monto;
    }
}