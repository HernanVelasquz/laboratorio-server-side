package org.sofka.unocatorce;
import java.util.Scanner;
import org.jboss.logging.Logger;

/**
 * Clase donde se encuentra resulto el ejercicio Ocho del taller de
 * Java, del curso Introduccion al desarrollo.
 * @author Hernan Velasquez
 * @version 4/06/2022/A
 */
public class EjercicioOcho {
    // Inicializaciones para poder mostrar por consola y recibir los datos
    private static Logger log = Logger.getLogger(EjercicioOcho.class);
    private static Scanner scanner = new Scanner(System.in);
    /**
     * Metodo principal que permite iniciar el programa
     */
    public static void main(String[] args) {
        laboralSemana();
    }
    /**
     * Metodo encargado para validar el dia de la semana
     */
    private static void laboralSemana(){
        log.info("Escriba un dia de la Semana");
        String dia = scanner.nextLine();

        switch (dia.toUpperCase()) {
            case "LUNES" : case "MARTES" : case "MIERCOLES" : case "JUEVES" : case "VIERNES":
                log.info("Es un dia laboral");
                break;
            case "SABADO" : case "DOMINGO" :
                log.info("No es un dia Laboral");
                break;
            default:
                log.info("No es un dia de Semana");
                break;
        }
    }
}
