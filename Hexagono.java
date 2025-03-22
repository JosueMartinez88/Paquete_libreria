package Figurasgeometricas;

/**
 * @author JosueAldairMartínezVera
 * @author DarianGiselleSolisContreras
 * Clase que representa un Hexágono y permite calcular su área y perímetro.
 */
public class Hexagono extends Base {
    private double lado;
    private double apotema;

    /**
     * Constructor de la clase Hexágono.
     * @param lado Longitud de un lado del hexágono.
     * @param apotema Apotema del hexágono.
     */
    public Hexagono(double lado, double apotema) {
        this.lado = lado;
        this.apotema = apotema;
    }

    @Override
    public double calcularArea() {
        return ((6 * lado) * apotema) / 2;
    }

    @Override
    public double calcularPerimetro() {
        return 6 * lado;
    }
}
