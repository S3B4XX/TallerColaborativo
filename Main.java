package Hoteleria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        Scanner in = new Scanner(System.in);

        System.out.println("Bienvenido presione 1 para empezar: \n");
        int opcion;

        do{
            System.out.println("\n----------Bienvenido al sistema de gestión de Hotel------------");
            System.out.println("\n Menú:");
            System.out.println("\nSeleccione un número segun la opcion deseada: ");
            System.out.println("\n1.Agregar Habitación");
            System.out.println("\n2.Reservar Habitación");
            System.out.println("\n3.Cancelar reserva");
            System.out.println("\n4.Consultar habitacion");
            System.out.println("\n5.Salir");
            opcion = in.nextInt();

            switch(opcion){
                case 1:
                    System.out.println("Ingrese el numero de la habitación (1-110): \n");
                    int numHabitacion = in.nextInt();
                    if(numHabitacion < 1 || numHabitacion > 110){
                        System.out.println("Numero invalido!");
                    } else {
                        System.out.println("Ingrese el tipo de habitacion (Simple / Doble / Suite\n");
                        in.nextLine();
                        String tipoHabitacion = in.nextLine();
                        System.out.println("Ingrese la capacidad de la habitacion\n");
                        int capacidad = in.nextInt();
                        hotel.agregarHabitacion(new Habitacion(numHabitacion,true,tipoHabitacion,capacidad));
                    }
                    break;

                case 2:
                    System.out.println("Ingrese el numero de habitacion que desea reservar\n");
                    int numHabitacionReserva = in.nextInt();
                    System.out.println("Ingrese el nombre del cliente\n");
                    in.nextLine();
                    String nombreCliente = in.nextLine();
                    System.out.println("Ingrese la fecha de inicio (DD-MM-AAA)\n");
                    String fechaInicio = in.nextLine();
                    System.out.println("Ingrese la fecha de fin (DD-MM-AAA)\n");
                    String fechaFin = in.nextLine();
                    hotel.crearReserva(numHabitacionReserva,nombreCliente,fechaInicio,fechaFin);
                    break;

                case 3:
                    System.out.println("Ingrese el numero de habitacion a cancelar\n");
                    int numHabitacionCancelar = in.nextInt();
                    System.out.println("Ingrese el nombre del cliente\n");
                    in.nextLine();
                    String nombreClienteCancelar = in.nextLine();
                    hotel.cancelarReserva(numHabitacionCancelar,nombreClienteCancelar);
                    break;

                case 4:
                    System.out.println("Ingrese el numero de habitacion que desea consultar: ");
                    int numHabitacionConsulta = in.nextInt();
                    hotel.consultarDisponibilidad(numHabitacionConsulta);
                    break;

                case 5:
                    System.out.println("Saliendo...\n");
                    System.out.println("Hasta la proxima!");
                    break;

                default:
                    System.out.println("Opcion no valida! Intente de nuevo porfavor.");
            }
        } while(opcion != 5);

        in.close();
        /*
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
        hotel.crearReserva(101, "Carlos García", "2024-11-28", "2024-11-30");*/
    }
}