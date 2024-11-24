package Hoteleria;

public class Reserva {
    private Habitacion habitacion;
    private String cliente;
    private String inicio;
    private String fin;

    // Constructor
    public Reserva(Habitacion habitacion, String cliente, String inicio, String fin) {
        this.habitacion = habitacion;
        this.cliente = cliente;
        this.inicio = inicio;
        this.fin = fin;
        habitacion.setDisponible(false); // La habitación se marca como no disponible
    }

    // Getters
    public Habitacion getHabitacion() {
        return habitacion;
    }

    public String getCliente() {
        return cliente;
    }

    public String getInicio() {
        return inicio;
    }

    public String getFin() {
        return fin;
    }

    // Cancelar la reserva
    public void cancelar() {
        habitacion.setDisponible(true); // Marca la habitación como disponible
    }
}