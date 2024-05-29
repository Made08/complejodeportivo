package co.madelem.complejo.dominio;

public class CanchaFutbolSala extends Cancha {
    public CanchaFutbolSala(int id, String nombre, double precio) {
        super(id, nombre, precio);
    }

    @Override
    public String getDetalles() {
        return "Cancha: " + nombre + ", Tipo: Futbol Sala, Precio: " + precio + ", estadoDisponible: " + estadoDisponible;
    }
}