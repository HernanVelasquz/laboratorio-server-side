package org.sofka.unocatorce;
import java.util.Scanner;
import org.jboss.logging.Logger;

/**
 * Clase donde se encuentra resulto el ejercicio Nueve del taller de
 * Java, del curso Introduccion al desarrollo.
 * @author Hernan Velasquez
 * @version 4/06/2022/A
 */
public class EjercicioNueve {
    // Inicializaciones para poder mostrar por consola y recibir los datos
    private static Logger log = Logger.getLogger(EjercicioNueve.class);
    private static Scanner scanner = new Scanner(System.in);

    /**
     * Metodo principal que permite iniciar el programa
     */
    public static void main(String[] args) {
        textModificate();
    }

    /**
     * Metodo encargado de ejecutar el cambio de la frase
     */
    private static void textModificate(){
        String phraseStored = "La sonrisa sera la mejor arma contra la tristeza";
        log.info("Bienvenid@ al programa que cambia las letras a por las e\n");
        log.info("Por favor ingresa una frase\n");
        String phraseEntered = scanner.nextLine();
        phraseStored = phraseStored.replace("a", "e");
        String result = (phraseStored + " " + phraseEntered);
        log.info(result);
    }
}
