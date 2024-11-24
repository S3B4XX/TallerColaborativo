package Hoteleria;

public class Main {
    public static void main(String[] args) {
        // Crear un hotel
        Hotel hotel = new Hotel();

        // Agregar habitaciones al hotel
        hotel.agregarHabitacion(new Habitacion(101, true, "Simple", 1));
        hotel.agregarHabitacion(new Habitacion(102, true, "Doble", 2));
        hotel.agregarHabitacion(new Habitacion(103, true, "Suite", 4));

        // Consultar disponibilidad de habitaciones
        hotel.consultarDisponibilidad(101);

        // Crear reservas
        hotel.crearReserva(101, "Juan Pérez", "2024-11-25", "2024-11-30");
        hotel.crearReserva(102, "Ana López", "2024-11-26", "2024-11-27");

        // Consultar disponibilidad después de las reservas
        hotel.consultarDisponibilidad(101);
        hotel.consultarDisponibilidad(102);

        // Intentar reservar una habitación ocupada
        hotel.crearReserva(101, "Carlos García", "2024-11-28", "2024-11-30");
    }
}