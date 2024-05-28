package co.madelem.complejo.dominio;

abstract class Pago {
    public abstract String procesarPago(double monto);
}

class PagoEfectivo extends Pago {
    @Override
    public String procesarPago(double monto) {
        return "Pago en efectivo procesado por el monto de: " + monto;
    }
}

class PagoTarjeta extends Pago {
    @Override
    public String procesarPago(double monto) {
        return "Pago con tarjeta procesado por el monto de: " + monto;
    }
}

class PagoPayPal extends Pago {
    @Override
    public String procesarPago(double monto) {
        return "Pago con PayPal procesado por el monto de: " + monto;
    }
}
