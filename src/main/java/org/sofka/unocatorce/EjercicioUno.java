package org.sofka.unocatorce;
import org.jboss.logging.Logger;
/**
 * Clase donde se encuentra resulto el ejercicio Uno del taller de
 * Java, del curso Introduccion al desarrollo.
 * @author Hernan Velasquez
 * @version 4/06/2022/A
 */
public class EjercicioUno {
    // Importacion de la clase para la logger para imprimir por consola.
    private static Logger log = Logger.getLogger(EjercicioUno.class);

    public static void main(String[] args) {
        compareTwoNumbers();
    }
    /**
     * Clase encargada de ejecutar el codigo para comparar dos numeros.
     */
    private static void compareTwoNumbers(){
        int numberOne = 74;
        int numberTwo = 75;

        if(numberOne == numberTwo){
            log.info("El Numero Uno y el Numero Dos, son Iguales");
        }else if(numberOne > numberTwo){
            log.info("El Numero Uno es mayor que el Numero Dos");
        }else{
            log.info("El Numero Dos es mayor que el Numero Uno");
        }
    }
}
