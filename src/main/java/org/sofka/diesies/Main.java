package org.sofka.diesies;

import org.jboss.logging.Logger;

import java.util.Scanner;

public class Main {
    // Inicializaciones para poder mostrar por consola y recibir los datos, ademas de capturar los datos
    private static Logger log = Logger.getLogger(Persona.class);
    private static Scanner scanner = new Scanner(System.in);

    private static void reedInformation(){
        log.info("Ingrese su nombre");
        String nombre = scanner.nextLine();
       log.info("Ingrese su edad");
        int edad = Integer.parseInt(scanner.nextLine());
        log.info("Ingrese su sexo H para hombre o M para mujer ");
        String sexo = scanner.nextLine();
        sexo = sexo.toUpperCase();
        char sexoChar = sexo.charAt(0);
        log.info("Ingrese su peso en kilogramos");
        double peso = Double.parseDouble(scanner.nextLine());
        log.info("Ingrese su altura en metros");
        double altura = Double.parseDouble(scanner.nextLine());

        Persona personaUno = new Persona(nombre, edad, sexoChar, peso, altura);
        Persona personaDos = new Persona(nombre, edad, sexoChar);
        Persona personaTres = new Persona();

        personaTres.setNombre("David");
        personaTres.setEdad(21);
        personaTres.setSexo('H');
        personaTres.setPeso(95);
        personaTres.setAltura(1.95);

        personaDos
    }
}
