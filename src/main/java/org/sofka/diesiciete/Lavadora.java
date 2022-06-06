package org.sofka.diesiciete;
import org.sofka.diesiciete.Electrodomestico;

public class Lavadora extends Electrodomestico{
    private final static int CARGA_DEF = 5;
    private int carga;

    public int getCarga() {
        return carga;
    }
    public double precioFinal() {
        double plus = super.precioFinal();
        if (carga > 30) {
            plus += 50;
        }
        return plus;
    }
    public Lavadora() {
        this.precioBase = this.PRECIO_BASE_DEF;
        this.peso = this.PESO_DEF;
        this.consumoEnergetico = this.CONSUMO_ENERGETICO_DEF;
        this.color = this.COLOR_DEF;
        this.carga = this.CARGA_DEF;
    }
    public Lavadora(double precioBase, double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.consumoEnergetico = this.CONSUMO_ENERGETICO_DEF;
        this.color = this.COLOR_DEF;
        this.carga = this.CARGA_DEF;
    }
    public Lavadora(double precioBase, double peso, char consumoEnergetico, String color, int carga) {
        super(precioBase, peso, consumoEnergetico, color);
        this.carga = carga;
    }
}
