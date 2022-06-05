package org.sofka.quince;

import org.jboss.logging.Logger;
import org.sofka.unocatorce.EjercicioCatorce;

import java.util.Scanner;

/**
 * Clase se encarga de mostrar el menu que se implementa
 * en la solucion del ejercicio Quince del taller de
 * Java, del curso Introduccion al desarrollo.
 * @author Hernan Velasquez
 * @version 4/06/2022/A
 */
public class Menu {
    // Inicializaciones para poder mostrar por consola y recibir los datos, ademas de capturar los datos
    private static Logger log = Logger.getLogger(EjercicioCatorce.class);
    private static Scanner scanner = new Scanner(System.in);

    /**
     * Metodo encargado de motrar el menu
     */
    private static void mostrarMenu(){
        log.info("******GESTION CINEMATOGRAFICA********");
        log.info("1-NUEVO ACTOR");
        log.info("2-BUSCAR ACTOR");
        log.info("3-ELIMINAR ACTOR");
        log.info("4-MODIFICAR ACTOR");
        log.info("5-VER TODOS LOS ACTORES");
        log.info("6-VER PELICULAS TODOS DE LOS ACTORES");
        log.info("7-VER CATEGORIAS DE LAS PELICULAS TODOS DE LOS ACTORES");
        log.info("8-SALIR");
    }

    /**
     * Metodo encargado de capturar la opcio del menu
     * @return {int} retora la opcion del usuario.
     */
    private static int option(){
        log.info("Ingrese una opcion valida");
        int optionVali = Integer.parseInt(scanner.nextLine());
        return optionVali;
    }

    public void start(){
        mostrarMenu();
        switch (option()) {
            case 1:
                start();
                break;
            case 2:
                start();
                break;
            case 3:
                start();
                break;
            case 4:
                start();
                break;
            case 5:
                start();
                break;
            case 6:
                start();
                break;
            case 7:
                start();
                break;
            case 8:
                break;
            default:
                System.out.println("Opcion no valida");
                start();
                break;
        }

    }
}
