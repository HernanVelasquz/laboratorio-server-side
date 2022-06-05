package org.sofka.unocatorce;
import java.util.Scanner;
import org.jboss.logging.Logger;

/**
 * Clase donde se encuentra resulto el ejercicio Once del taller de
 * Java, del curso Introduccion al desarrollo.
 * @author Hernan Velasquez
 * @version 4/06/2022/A
 */
public class EjercicioOnce {
    // Inicializaciones para poder mostrar por consola y recibir los datos
    private static Logger log = Logger.getLogger(EjercicioOnce.class);
    private static Scanner scanner = new Scanner(System.in);

    /**
     * Metodo principal que permite iniciar el programa
     */
    public static void main(String[] args) {
        vocalCount();
    }
    /**
     * Metodo encargado de ejecutar el calculo de la cantidad de vocales.
     */
    private static void vocalCount() {
        int contadorVocales = 0;
        log.info("Ingrese Una frase");
        String text = scanner.nextLine();

        for (int i = 0; i < text.length(); i++) {
            if(text.toUpperCase().charAt(i) == 'A' ||text.toUpperCase().charAt(i) == 'E'
                    || text.toUpperCase().charAt(i) == 'I' || text.toUpperCase().charAt(i) == 'O'
                    || text.toUpperCase().charAt(i) == 'U'){
                contadorVocales++;
            }
        }

        log.info("La logitud de la frase es: " + text.length());
        log.info("La cantidad de vocales de la frase es: " + contadorVocales);
    }

}
