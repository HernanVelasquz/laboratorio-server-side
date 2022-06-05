package org.sofka.unocatorce;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.jboss.logging.Logger;

/**
 * Clase donde se encuentra resulto el ejercicio Dies del taller de
 * Java, del curso Introduccion al desarrollo.
 * @author Hernan Velasquez
 * @version 4/06/2022/A
 */

public class EjercicioCatorce {
    // Inicializaciones para poder mostrar por consola y recibir los datos, ademas de capturar los datos
    private static Logger log = Logger.getLogger(EjercicioCatorce.class);
    private static Scanner scanner = new Scanner(System.in);
    private static List<Integer> numbers = new ArrayList<Integer>();
    /**
     * Metodo principal que permite iniciar el programa
     */
    public static void main(String[] args) {
        numbersIngresado();
    }

    private static void numbersIngresado(){
        log.info("Igresar un numero");
        int number = Integer.parseInt(scanner.nextLine());
        for(int i = number; i <= 100; i++){
            numbers.add(i);
        }
        log.info("Los numeros son: " + numbers);
    }
}
