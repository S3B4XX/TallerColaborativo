package Hoteleria;

public class Habitacion {
    private int numeroHabitacion;
    private boolean disponible;
    private String tipo;
    private int capacidad;

    // Constructor
    public Habitacion(int numeroHabitacion, boolean disponible, String tipo, int capacidad) {
        this.numeroHabitacion = numeroHabitacion;
        // modificar inicilizando el disponible, como true para que todas las habitaciones comienzen como disponibles
        this.disponible = true;
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

    /*
    Metodo ya no necesario si se usa le metodo ocupado y libre
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
     */

    public String getTipo() {
        return tipo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    //Metodos de reemplazo y cambio de la disponibilidad
    public void ocupado(){
        this.disponible = false;
    }

    public void libre(){
        this.disponible = true;
    }

    //En necesario el metodo toString???

    @Override
    public String toString() {
        return "Habitacion{" +
                "numeroHabitacion=" + numeroHabitacion +
                ", disponible=" + disponible +
                ", tipo='" + tipo + '\'' +
                ", capacidad=" + capacidad +
                '}';
    }
}