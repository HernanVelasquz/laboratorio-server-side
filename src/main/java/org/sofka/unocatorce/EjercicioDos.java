package org.sofka.unocatorce;

import java.util.Scanner;
import org.jboss.logging.Logger;

/**
 * Clase donde se encuentra resulto el ejercicio Dos del taller de
 * Java, del curso Introduccion al desarrollo.
 * @author Hernan Velasquez
 * @version 4/06/2022/A
 */
public class EjercicioDos {
    // Inicializaciones para poder mostrar por consola y recibir los datos
    private static Logger log = Logger.getLogger(EjercicioDos.class);
    private static Scanner scanner = new Scanner(System.in);

    /**
     * Metodo principal que permite iniciar el programa
     */
    public static void main(String[] args) {

        log.info("Ingrese un numero");
        int numberOne = scanner.nextInt();
        log.info("Ingrese un segundo numero");
        int numberTwo = scanner.nextInt();

        compareTwoNumbers(numberOne, numberTwo);
    }

    /**
     * Clase encargada de recibir los numeros del usuario y validar cual es al mayor
     * @param numberOne
     * @param numberTwo
     */
    private static void compareTwoNumbers(int numberOne, int numberTwo) {
        if(numberOne == numberTwo){
            log.info("El numero Uno y el numero Dos son iguales");
        }else if(numberOne > numberTwo){
            log.info("El numero Uno es mayor que el numero Dos");
        }else{
            log.info("El numero Dos es mayor que el numero Uno");
        }
    }
}
