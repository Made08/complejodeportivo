package co.madelem.complejo.dominio;

abstract class Cancha {
    protected int id;
    protected String nombre;
    protected double precio;
    protected boolean estadoDisponible;

    public Cancha(int id, String nombre, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    public abstract String getDetalles();
}

class CanchaFutbolSala extends Cancha {
    public CanchaFutbolSala(int id, String nombre, double precio) {
        super(id, nombre, precio);
    }

    @Override
    public String getDetalles() {
        return "Cancha: " + nombre + ", Tipo: Futbol Sala, Precio: " + precio + ", estadoDisponible: " + estadoDisponible;
    }
}

class CanchaFutbol11 extends Cancha {
    public CanchaFutbol11(int id, String nombre, double precio) {
        super(id, nombre, precio);
    }

    @Override
    public String getDetalles() {
        return "Cancha: " + nombre + ", Tipo: Futbol 11, Precio: " + precio + ", estadoDisponible: " + estadoDisponible;
    }
}

class CanchaFutbol7 extends Cancha {
    public CanchaFutbol7(int id, String nombre, double precio) {
        super(id, nombre, precio);
    }

    @Override
    public String getDetalles() {
        return "Cancha: " + nombre + ", Tipo: Futbol 7, Precio: " + precio + ", estadoDisponible: " + estadoDisponible;
    }
}
