package org.sofka.unocatorce;

import java.util.Scanner;
import org.jboss.logging.Logger;

/**
 * Clase donde se encuentra resulto el ejercicio Siete del taller de
 * Java, del curso Introduccion al desarrollo.
 * @author Hernan Velasquez
 * @version 4/06/2022/A
 */
public class EjercicioSiete {
    // Inicializaciones para poder mostrar por consola y recibir los datos
    private static Logger log = Logger.getLogger(EjercicioSiete.class);
    private static Scanner scanner = new Scanner(System.in);

    /**
     * Metodo principal que permite iniciar el programa
     */
    public static void main(String[] args) {
        number();
    }
    /**
     * Metodo de la clase encargado de
     * ejecutar la entrada y validacion del numero ingresado
     */
    private static void number(){
        int number;
        do{
            log.info("Ingrese un numero");
            number = scanner.nextInt();
        }while(number < 0);
        log.info("El numero es: " + number);
    }

}
