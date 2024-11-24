package Hoteleria;

public class Habitacion {
    private int numeroHabitacion;
    private boolean disponible;
    private String tipo;
    private int capacidad;

    // Constructor
    public Habitacion(int numeroHabitacion, boolean disponible, String tipo, int capacidad) {
        this.numeroHabitacion = numeroHabitacion;
        this.disponible = disponible;
        this.tipo = tipo;
        this.capacidad = capacidad;
    }

    // Getters y Setters
    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public String getTipo() {
        return tipo;
    }

    public int getCapacidad() {
        return capacidad;
    }
}