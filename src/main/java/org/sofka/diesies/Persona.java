package org.sofka.diesies;

/**
 * Clase que complementa la solucion del ejercicio
 * dieciseis del taller de java
 * Java, del curso Introduccion al desarrollo.
 * @author Hernan Velasquez
 * @version 4/06/2022/A
 */
public class Persona {
    public final static char SEXO_DEF = 'H';
    public static final int INFRAPESO = -1;
    public static final int PESO_IDEAL = 0;
    public static final int SOBREPESO = 1;
    private String nombre;
    private int edad;
    private String DNI;
    private char sexo;
    private double peso;
    private double altura;

    /**
     * Constructor diseñado implemetado para pasar las variables a la clase persona
     * @param nombre
     * @param edad
     * @param sexo
     * @param peso
     * @param altura
     */
    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        generarDNI();
        comprobarSexo();
    }

    /**
     * Contructor encargado de recibir res atributos fijos
     * y los demas seran asignados por los metodos get y set
     * @param nombre
     * @param edad
     * @param sexo
     */
    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = 0;
        this.altura = 0;
        generarDNI();
        comprobarSexo();
    }

    /**
     * Constructor vacio que inicializa los atributos de la clase
     * Y permitiendo que los modificadores de acceso modifiquen su contenido.
     */
    public Persona() {
        this.nombre = "";
        this.edad = 0;
        this.sexo = this.SEXO_DEF;
        this.peso = 0;
        this.altura = 0;
        generarDNI();
        comprobarSexo();
    }

    /**
     * Metodo encargdo de acer el calculo del peso ideal de la persona
     * @return
     */
    public int calcularIMC() {
        double pesoActual = peso / (Math.pow(altura, 2));
        if (pesoActual >= 20 && pesoActual <= 25) {
            return PESO_IDEAL;
        } else if (pesoActual < 20) {
            return INFRAPESO;
        } else {
            return SOBREPESO;
        }
    }

    public boolean esMayorDeEdad() {
        if (this.edad < 18) {
            return false;
        } else {
            return true;
        }
    }

    private void comprobarSexo() {
        if (this.sexo != 'H' || this.sexo != 'M') {
            this.sexo = SEXO_DEF;
        }
    }
    private void generarDNI() {
        final int divisor = 23;
        int numDNI = ((int) Math.floor(Math.random() * (100000000 - 10000000) + 10000000));
        int res = numDNI - (numDNI / divisor * divisor);
        char letraDNI = generaLetraDNI(res);
        DNI = Integer.toString(numDNI) + letraDNI;
    }

    private char generaLetraDNI(int res) {
        char letras[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y',
                'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
                'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        return letras[res];
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {

        String sexo;
        if (this.sexo == 'H') {
            sexo = "hombre";
        } else if (this.sexo == 'M') {
            sexo = "mujer";
        }
        return "Informacion de la persona:\n"
                + "Nombre: " + this.nombre + "\n"
                + "Sexo: " + this.sexo + "\n"
                + "Edad: " + this.edad + " años \n"
                + "DNI: " + this.DNI + "\n"
                + "Peso: " + this.peso + " kg \n"
                + "Altura: " + this.altura + " metros \n";
    }
}
