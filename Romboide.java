package Figurasgeometricas;

/**
 * @author JosueAldairMartínezVera
 * @author DarianGiselleSolisContreras
 * Clase que representa un Romboide y permite calcular su área y perímetro.
 */
public class Romboide extends Base {
    private double base;
    private double altura;

    /**
     * Constructor de la clase Romboide.
     * @param base Longitud de la base del romboide.
     * @param altura Altura del romboide.
     */
    public Romboide(double base, double altura) {
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
