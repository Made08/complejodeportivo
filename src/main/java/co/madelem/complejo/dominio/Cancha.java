package co.madelem.complejo.dominio;

public abstract class Cancha {
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

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio(){
        return this.precio;
    }

    public boolean getEstadoDisponible(){
        return this.estadoDisponible;
    }
}