package org.sofka.unocatorce;
import java.util.Scanner;

import org.jboss.logging.Logger;

/**
 * Clase donde se encuentra resulto el ejercicio Cuatro del taller de
 * Java, del curso Introduccion al desarrollo.
 * @author Hernan Velasquez
 * @version 4/06/2022/A
 */
public class EjercicioCuatro {
    // Inicializaciones para poder mostrar por consola y recibir los datos
    private static Logger log = Logger.getLogger(EjercicioCuatro.class);
    private static Scanner scanner = new Scanner(System.in);
    /**
     * Metodo principal que permite iniciar el programa
     * y recibir los dato por consola
     */
    public static void main(String[] args) {
        log.info("Ingrese el valor del produto en COP");
        double precioProducto = Double.parseDouble(scanner.nextLine());

        calculateIVA(precioProducto);
    }

    /**
     * Metodo encargado de recibir el dato capturado por consola
     * Y realizar los respectovos calculos y presentarcelos al usuario por consola.
     * @param precioProducto
     */
    private static void calculateIVA(double precioProducto){
        double precioTotalProduct = precioProducto;
        final double IVA = 0.21;
        log.info("El precio del IVA es: " + (precioProducto * IVA));
        precioTotalProduct += precioProducto * IVA;
        log.info("El precio total del Producto con IVA es: " + precioTotalProduct);
    }

}
