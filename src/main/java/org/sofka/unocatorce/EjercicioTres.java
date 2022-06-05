package org.sofka.unocatorce;
import java.util.Scanner;
import org.jboss.logging.Logger;
/**
 * Clase donde se encuentra resulto el ejercicio Tres del taller de
 * Java, del curso Introduccion al desarrollo.
 * @author Hernan Velasquez
 * @version 4/06/2022/A
 */
public class EjercicioTres {
    // Inicializaciones de para poder recibir y mostrar por consola
    private static Logger log = Logger.getLogger(EjercicioTres.class);
    private static Scanner scanner = new Scanner(System.in);
    /**
     * Metodo encargado de ejercutar todo el programa
     * Se encarga de recibir los datos de entradas por consola.
     */
    public static void main(String[] args) {

        log.info("Ingrise el radio de Circulo en Centimetros");
        double radio = Double.parseDouble(scanner.nextLine());

        calculateAreaCircu(radio);
    }

    /**
     * Funcion en cargada de calular el radio.
     * @param radio
     */
    private static void calculateAreaCircu(double radio) {
        double area = Math.PI * Math.pow(radio, 2);
        log.info("El area del circulo es: " + area + " cm");
    }

}
