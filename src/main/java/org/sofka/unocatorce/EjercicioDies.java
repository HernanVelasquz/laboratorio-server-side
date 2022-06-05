package org.sofka.unocatorce;
import java.util.Scanner;
import org.jboss.logging.Logger;

/**
 * Clase donde se encuentra resulto el ejercicio Dies del taller de
 * Java, del curso Introduccion al desarrollo.
 * @author Hernan Velasquez
 * @version 4/06/2022/A
 */
public class EjercicioDies {
    // Inicializaciones para poder mostrar por consola y recibir los datos
    private static Logger log = Logger.getLogger(EjercicioDies.class);
    private static Scanner scanner = new Scanner(System.in);
    /**
     * Metodo principal que permite iniciar el programa
     */
    public static void main(String[] args) {
        deleteSpace();
    }
    /**
     * Funcion encargada de realizar el remplazo de los espacios en la frase
     */
    private static void deleteSpace(){
        String textoModificado = "";
        log.info("Ingrese una frase");
        String text = scanner.nextLine();

        textoModificado = text.replace(" ", "");
        log.info(textoModificado);
    }
}
