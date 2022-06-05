package org.sofka.unocatorce;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

import org.jboss.logging.Logger;
/**
 * Clase donde se encuentra resulto el ejercicio Trece del taller de
 * Java, del curso Introduccion al desarrollo.
 * @author Hernan Velasquez
 * @version 4/06/2022/A
 */
public class EjercicioTrece {
    // Inicializaciones para poder mostrar por consola y recibir los datos
    private static Logger log = Logger.getLogger(EjercicioTrece.class);
    private static Scanner scanner = new Scanner(System.in);
    /**
     * Metodo principal que permite iniciar el programa
     */
    public static void main(String[] args) {
        consultDateLocal();
    }

    /**
     * Metdo encargado de mostrar la fecha actual
     */
    private static void consultDateLocal(){
        log.info("Consultar la fecha y hora actual " + "\n" + "y para si o n para no");
        String option = scanner.nextLine();

        switch(option.toUpperCase()){
            case "Y":
                LocalDate fecha = LocalDate.now();
                LocalTime hora = LocalTime.now();
                log.info("La fecha y hora actual es \n" + fecha + "\n" + hora);
                break;
            case "N" :
                log.info("Esta bien nos vemos a la proxima");
                break;
            default:
                log.info("Escogio una opcion no valida");
        }
    }
}
