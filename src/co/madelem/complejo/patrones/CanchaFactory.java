package co.madelem.complejo.patrones;

import co.madelem.complejo.dominio.Cancha;
import co.madelem.complejo.dominio.CanchaFutbolSala;
import co.madelem.complejo.dominio.CanchaFutbol11;
import co.madelem.complejo.dominio.CanchaFutbol7;

public class CanchaFactory {
    public static Cancha crearCancha(String tipo, int id, String nombre, double precio) {
        switch (tipo) {
            case "Futbol Sala":
                return new CanchaFutbolSala(id, nombre, precio);
            case "Futbol 11":
                return new CanchaFutbol11(id, nombre, precio);
            case "Futbol 7":
                return new CanchaFutbol7(id, nombre, precio);
            default:
                throw new IllegalArgumentException("Tipo de cancha no reconocido");
        }
    }
}
