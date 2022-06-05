package org.sofka.unocatorce;
import java.util.Scanner;
import org.jboss.logging.Logger;

/**
 * Clase donde se encuentra resulto el ejercicio Doce del taller de
 * Java, del curso Introduccion al desarrollo.
 * @author Hernan Velasquez
 * @version 4/06/2022/A
 */
public class EjercicioDoce {
    // Inicializaciones para poder mostrar por consola y recibir los datos
    private static Logger log = Logger.getLogger(EjercicioDoce.class);
    private static Scanner scanner = new Scanner(System.in);
    private static int contadorMayor;
    private static int contadorMenor;
    private static String diferenciaUno;
    private static String diferenciaDos;
    private static String palabraMayor;
    private static String palabraMenor;
    /**
     * Meodo encargado de inicirlizar la todo el codigo.
     */
    public static void main(String[] args) {
        readConsole();
    }

    /**
     * Metodo encargado de ejecutiar la captura de los datos por parte del
     * usuario.
     */
    private static void readConsole(){
        log.info("Escriba la primera paabra");
        String palabraUno = scanner.nextLine();
        log.info("Escriba la segunda palabra");
        String palabraDos = scanner.nextLine();

        comparePalabras(palabraUno, palabraDos);
    }

    /**
     * Metodo en cargada de recibir los dato ingresados por el usuario
     * y realizar las respectivas comparaciones.
     * @param palabraUno
     * @param palabraDos
     */
    private static void comparePalabras(String palabraUno, String palabraDos){

        if(palabraUno.equalsIgnoreCase(palabraDos)){
            log.info("Las palabras son iguales");
        }else{
            if(palabraUno.length() > palabraDos.length()){
                contadorMayor = palabraUno.length();
                contadorMenor = palabraDos.length();
                palabraMayor = palabraUno;
                palabraMenor = palabraDos;
            }else {
                contadorMayor = palabraDos.length();
                contadorMenor = palabraUno.length();
                palabraMayor = palabraDos;
                palabraMenor = palabraUno;
            }

            for (int i = contadorMenor; i < contadorMayor; i++){
                palabraMenor += " ";
            }
            for (int i = 0; i < contadorMayor; i++) {
                if (palabraMayor.charAt(i) != palabraMenor.charAt(i) ){
                    diferenciaUno += palabraMayor.charAt(i);
                    diferenciaDos += palabraMenor.charAt(i);
                }
            }
            log.info("Las palabras son diferentes y las diferencias son: " + diferenciaUno + " " +diferenciaDos);
        }
    }
}
