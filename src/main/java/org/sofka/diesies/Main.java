package org.sofka.diesies;

import org.jboss.logging.Logger;

import java.util.Scanner;

public class Main {
    // Inicializaciones para poder mostrar por consola y recibir los datos, ademas de capturar los datos
    private static Logger log = Logger.getLogger(Persona.class);
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String nombre;
        int edad;
        String sexo;
        char sexoChar;
        double peso;
        double altura;

        log.info("Ingrese su nombre");
        nombre = scanner.nextLine();
        log.info("Ingrese su edad");
        edad = Integer.parseInt(scanner.nextLine());
        log.info("Ingrese su sexo H para hombre o M para mujer ");
        sexo = scanner.nextLine();
        sexo = sexo.toUpperCase();
        sexoChar = sexo.charAt(0);
        log.info("Ingrese su peso en kilogramos");
        peso = Double.parseDouble(scanner.nextLine());
        log.info("Ingrese su altura en metros");
        altura = Double.parseDouble(scanner.nextLine());

        Persona per1 = new Persona(nombre, edad, sexoChar, peso, altura);
        Persona per2 = new Persona(nombre, edad, sexoChar);
        Persona per3 = new Persona();

        per3.setNombre("Samuel");
        per3.setEdad(17);
        per1.setSexo('H');
        per3.setPeso(75);
        per3.setAltura(1.65);

        per2.setPeso(90);
        per2.setAltura(1.75);

        log.info("Per1");

        mostrarPeso(per1);

        MuestraMayorEdad(per1);

        log.info(per1.toString());
        log.info("Per2");
        mostrarPeso(per2);
        MuestraMayorEdad(per2);
        log.info(per2.toString());

        log.info("Per3");
        mostrarPeso(per3);
        MuestraMayorEdad(per3);
        log.info(per3.toString());
    }

    public static void mostrarPeso(Persona per) {
        int IMC = per.calcularIMC();

        switch (IMC) {
            case Persona.PESO_IDEAL:
                log.info("La persona esta en su peso ideal");
                break;
            case Persona.INFRAPESO:
                log.info("La persona esta por debajo de su peso ideal");
                break;
            case Persona.SOBREPESO:
                log.info("La persona esta por encima de su peso ideal");
                break;
            default:
                log.info("Error en el peso");
        }
    }

    public static void MuestraMayorEdad(Persona per) {
        if (per.esMayorDeEdad()) {
            log.info("La persona es mayor de edad");
        } else {
            log.info("La persona no es mayor de edad");
        }
    }
}
