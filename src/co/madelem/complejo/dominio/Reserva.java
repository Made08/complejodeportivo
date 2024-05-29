package co.madelem.complejo.dominio;

import java.time.LocalDateTime;

public class Reserva {
    private int id;
    private Cliente cliente;
    private Cancha cancha;
    private LocalDateTime fechaHora;
    private double duracion;
    private String estado;

    public Reserva(int id, Cliente cliente, Cancha cancha, LocalDateTime fechaHora, double duracion) {
        this.id = id;
        this.cliente = cliente;
        this.cancha = cancha;
        this.fechaHora = fechaHora;
        this.duracion = duracion;
        this.estado = "Pendiente";
    }

    public void confirmarReserva() {
        this.estado = "Confirmada";
    }

    public void cancelarReserva() {
        this.estado = "Cancelada";
    }

    public String getDetalles() {
        return "Reserva ID: " + id + ", Cliente: " + cliente.getNombre() +
               ", Cancha: " + cancha.getDetalles() + ", Fecha: " + fechaHora +
               ", Duración: " + duracion + " horas, Estado: " + estado;
    }
}
