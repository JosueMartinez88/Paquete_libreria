package Figurasgeometricas;

/**
 * @author JosueAldairMartínezVera
 * @author DarianGiselleSolisContreras
 * @param
 * Clase que representa un Círculo y permite calcular su área y perímetro.
 */

public class Circulo extends Base{
    private double radio;

    /**
     * Constructor de la clase Círculo.
     * @param radio Radio del círculo.
     */
    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * (radio * radio);
    }

    @Override
    public double calcularPerimetro() {
        return (2 * radio) * Math.PI;
    }
}
