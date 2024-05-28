package co.madelem.complejo.patrones;

import co.madelem.complejo.dominio;

import java.util.ArrayList;
import java.util.List;

class GestionReservas {
    private static GestionReservas instancia;
    private List<Reserva> reservas;

    private GestionReservas() {
        reservas = new ArrayList<>();
    }

    public static GestionReservas getInstancia() {
        if (instancia == null) {
            instancia = new GestionReservas();
        }
        return instancia;
    }

    public void agregarReserva(Reserva reserva) {
        reservas.add(reserva);
    }

    public List<Reserva> obtenerReservas() {
        return reservas;
    }
}
