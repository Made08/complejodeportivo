package co.madelem.complejo.dominio;

public class PagoEfectivo extends Pago {
    @Override
    public String procesarPago(double monto) {
        return "Pago en efectivo procesado por el monto de: " + monto;
    }
}