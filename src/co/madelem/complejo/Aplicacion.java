package co.madelem.complejo;

import co.madelem.complejo.dominio.*;
import co.madelem.complejo.patrones.*;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        // Creación de Canchas, patron factory 
        Cancha cancha1 = CanchaFactory.crearCancha("Futbol Sala", 1, "Cancha 1", 50.0);
        Cancha cancha2 = CanchaFactory.crearCancha("Futbol 11", 2, "Cancha 2", 100.0);

        // Creación de Clientes
        Cliente cliente1 = new Cliente(1, "Juan Caicedo", "juancaidedo@gmail.com");
        Cliente cliente1 = new Cliente(2, "Madelem", "madelenchicovelasco@gmail.com");

        // Creación de Reservas
        Reserva reserva1 = new Reserva(1, cliente1, cancha1, LocalDateTime.of(2024, 6, 1, 18, 0), 2.0);
        Reserva reserva2 = new Reserva(2, cliente1, cancha2, LocalDateTime.of(2024, 6, 2, 20, 0), 1.5);
        Reserva reserva2 = new Reserva(3, cliente2, cancha1, LocalDateTime.of(2024, 6, 2, 22, 0), 1.5);

        // Gestión de Reservas, patron singleton
        GestionReservas gestionReservas = GestionReservas.getInstancia(); 
        gestionReservas.agregarReserva(reserva1);
        gestionReservas.agregarReserva(reserva2);

        // Procesamiento de Pagos
        Pago pago1 = new PagoEfectivo();
        System.out.println(pago1.procesarPago(cancha1.precio));

        Pago pago2 = new PagoTarjeta();
        System.out.println(pago2.procesarPago(cancha2.precio));

        Pago pago3 = new PagoPayPal();
        System.out.println(pago3.procesarPago(cancha1.precio));

        // Confirmar y Cancelar Reservas
        reserva1.confirmarReserva();
        System.out.println(reserva1.getDetalles());

        reserva2.cancelarReserva();
        System.out.println(reserva2.getDetalles());

        reserva3.cancelarReserva();
        System.out.println(reserva3.getDetalles());

        // Obtener todas las reservas
        for (Reserva reserva : gestionReservas.obtenerReservas()) {
            System.out.println(reserva.getDetalles());
        }
    }
}
