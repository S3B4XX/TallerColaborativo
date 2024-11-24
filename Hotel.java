package Hoteleria;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private List<Habitacion> habitaciones;
    private List<Reserva> reservas;

    // Constructor
    public Hotel() {
        this.habitaciones = new ArrayList<>();
        this.reservas = new ArrayList<>();
    }

    // Agregar habitación al hotel
    public void agregarHabitacion(Habitacion habitacion) {
        if(habitacion.getNumeroHabitacion()<1 || habitacion.getNumeroHabitacion()>110) {
            System.out.println("Error el número ingresado debe estar entre 1 y 110.");
            return;
        }
        habitaciones.add(habitacion);
        System.out.println("Habitacion"+habitacion.getNumeroHabitacion()+ "agregada con exito.");
    }

    // Crear una reserva
    public void crearReserva(int numeroHabitacion, String cliente, String inicio, String fin) {
        for (Habitacion habitacion : habitaciones) {
            if (habitacion.getNumeroHabitacion() == numeroHabitacion && habitacion.isDisponible()) {
                Reserva reserva = new Reserva(habitacion, cliente, inicio, fin);
                reservas.add(reserva);
                System.out.println("Reserva creada para " + cliente + " en la habitación " + numeroHabitacion);
                return;
            }
        }
        System.out.println("La habitación no está disponible.");
    }

    /*Pasar aquie el metodo de cancelar reserva*/
    public void cancelarReserva(int numeroHabitacion, String Cliente) {
        for (Reserva reserva : reservas) {
            if( reserva.getHabitacion().getNumeroHabitacion() == numeroHabitacion && reserva.getCliente().equals(Cliente)) {
                reserva.getHabitacion().libre();
                reservas.remove(reserva);
                System.out.println("Reserva cancelada para " + Cliente);
                return;
            }
        }
        System.out.println("No se encontró la reserva");
    }


    // Consultar disponibilidad de una habitación
    public void consultarDisponibilidad(int numeroHabitacion) {
        for (Habitacion habitacion : habitaciones) {
            if (habitacion.getNumeroHabitacion() == numeroHabitacion) {
                if (habitacion.isDisponible()) {
                    System.out.println("La habitación " + numeroHabitacion + " está disponible.");
                } else {
                    System.out.println("La habitación " + numeroHabitacion + " está reservada.");
                }
                return;
            }
        }
        System.out.println("La habitación " + numeroHabitacion + " no existe.");
    }
}