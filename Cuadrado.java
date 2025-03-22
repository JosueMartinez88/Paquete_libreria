package Figurasgeometricas;

/**
 * @author JosueAldairMartínezVera
 * @author DarianGiselleSolisContreras
 * Clase que representa un Cuadrado y permite calcular su área y perímetro.
 */
public class Cuadrado extends Base {
    private double lado;

    /**
     * Constructor de la clase Cuadrado.
     * @param lado Longitud de un lado del cuadrado.
     */
    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public double calcularPerimetro() {
        return 4 * lado;
    }
}
