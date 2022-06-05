package org.sofka.unocatorce;
import org.jboss.logging.Logger;
/**
 * Clase donde se encuentra resulto el ejercicio Seis del taller de
 * Java, del curso Introduccion al desarrollo.
 * @author Hernan Velasquez
 * @version 4/06/2022/A
 */
public class EjercicioSeis {
    // llamado para mostrar por consola.
    private static Logger log = Logger.getLogger(EjercicioSeis.class);

    /**
     * Metodo encargado de iniciar todo el programa
     * @param args
     */
    public static void main(String[] args) {
        showImparAndPar();
    }

    /**
     * Metodo encargado de mostrar los numeros pares e impares del 1 al 100
     * usado un ciclo for
     */
    private static void showImparAndPar(){
        log.info("Bienvenid@ al programa que muestra los números pares e impares entre 1 y 100\n ");

        for(int i = 1; i <= 100; i++){
            if (i % 2 == 0) {
                log.info("El número par" + i + " es par");
            }else if (i % 2 != 0) {
                log.info("El número " + i + " es impar");
            }
        }
    }
}
