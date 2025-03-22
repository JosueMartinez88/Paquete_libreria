package Figurasgeometricas;

/**
 * @author JosueAldairMartínezVera
 * @author DarianGiselleSolisContreras
 * Clase que representa un Rectángulo y permite calcular su área y perímetro.
 */
public class Rectangulo extends Base {
    private double base;
    private double altura;

    /**
     * Constructor de la clase Rectángulo.
     * @param base Longitud de la base del rectángulo.
     * @param altura Altura del rectángulo.
     */
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public double calcularPerimetro() {
        return (2 * base) + (2 * altura);
    }
}
