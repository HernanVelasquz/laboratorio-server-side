package org.sofka.unocatorce;

import org.jboss.logging.Logger;
/**
 * Clase donde se encuentra resulto el ejercicio Cinco del taller de
 * Java, del curso Introduccion al desarrollo.
 * @author Hernan Velasquez
 * @version 4/06/2022/A
 */
public class EjercicioCinco {
    private static Logger log = Logger.getLogger(EjercicioCinco.class);
    public static void main(String[] args) {
        showImparAndPar();
    }
    /**
     * Metodo encargado de mostrar los numeros pares e impares del 1 al 100
     * usado un ciclo while
     */
    private static void showImparAndPar(){
        log.info("Bienvenid@ al programa que muestra los números pares e impares entre 1 y 100\n ");

        int numberValue = 1;
        while (numberValue <= 100) {
            if (numberValue % 2 == 0) {
                log.info("El número par " + numberValue + " es par");
                numberValue++;
            } else if (numberValue % 2 != 0) {
                log.info("El número " + numberValue + " es impar");
                numberValue++;
            }
        }
    }
}
