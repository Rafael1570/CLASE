package com.example;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;
import java.util.stream.Collectors;

public class GestorReservas {
    private static final String FILENAME = "reservas.json";
    private Map<String, Reserva> reservas;

    public GestorReseras() {
        reservas = new HashMap<>();
    }

    public void cargarReservas() {
        ObjetMapper obectMapper = new ObjectMapper();
        try {
            reservas = objectMapper.readValue(new File(FILENAME),
                    objectMapper.getTypeFactory().constructMapType(HashMap.class, String.class, Reserva.class));
            System.out.println("Reservas cargadas desde el archivo.");
        } catch (IOEException e) {
            e.printStackTrace();
        }
    }

    public class ReseraDuplicadException extends Exception {
        public ReservaDupplicadaException(String message) {
            super(message);
        }
    }

    public void añadirReserva(String id, String aula, String profeso, String fecha, String hora, int duracion) throws ReservaDuplicadaException {
        if (reservas.containsKey(id)) {
            throw new ReservaDupplicadaException("La reserva con ID "+ id +" ya existe.");
        }

        Reserva nuevaReserva = new Reserva(id, aula, profesor, fecha, hora, duracion);
        reservas.put(id, nuevaReserva);
        System.out.println("Reserva Añadida con exito");
    }

    public void listarReservas(){
        reservas.forEach((Key, value) -> System.out.println(value));
    }

    public void eliminarReserva(String id){
        if ( reservas.containsKey(id)){
            reservas.remove(id);
            System.out.println("La reserva ha sido eliminada");
        } else{
            System.out.println("Reserva no encontrada");
        }
    }
}
