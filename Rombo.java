package Figurasgeometricas;

/**
 * @author JosueAldairMartínezVera
 * @author DarianGiselleSolisContreras
 * Clase que representa un Rombo y permite calcular su área y perímetro.
 */
public class Rombo extends Base {
    private double diametro_mayor;
    private double diametro_menor;
    private double lado;

    /**
     * Constructor de la clase Rombo.
     * @param diametro_mayor Diagonal mayor del rombo.
     * @param diametro_menor Diagonal menor del rombo.
     * @param lado Longitud de un lado del rombo.
     */
    public Rombo(double diametro_mayor, double diametro_menor, double lado) {
        this.diametro_mayor = diametro_mayor;
        this.diametro_menor = diametro_menor;
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return (diametro_mayor * diametro_menor) / 2;
    }

    @Override
    public double calcularPerimetro() {
        return 4 * lado;
    }
}
