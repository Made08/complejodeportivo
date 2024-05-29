package co.madelem.complejo.dominio;

public class CanchaFutbol7 extends Cancha {
    public CanchaFutbol7(int id, String nombre, double precio) {
        super(id, nombre, precio);
    }

    @Override
    public String getDetalles() {
        return "Cancha: " + nombre + ", Tipo: Futbol 7, Precio: " + precio + ", estadoDisponible: " + estadoDisponible;
    }
}
