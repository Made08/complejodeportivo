package co.madelem.complejo.dominio;

public class CanchaFutbol11 extends Cancha {
    public CanchaFutbol11(int id, String nombre, double precio) {
        super(id, nombre, precio);
    }

    @Override
    public String getDetalles() {
        return "Cancha: " + nombre + ", Tipo: Futbol 11, Precio: " + precio + ", estadoDisponible: " + estadoDisponible;
    }
}