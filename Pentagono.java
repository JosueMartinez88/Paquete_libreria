package Figurasgeometricas;

/**
 * @author JosueAldairMartínezVera
 * @author DarianGiselleSolisContreras
 * Clase que representa un Pentágono y permite calcular su área y perímetro.
 */
public class Pentagono extends Base {
    private double lado;
    private double apotema;

    /**
     * Constructor de la clase Pentágono.
     * @param lado Longitud de un lado del pentágono.
     *@param apotema Apotema del pentágono.
     */
    public Pentagono(double lado, double apotema) {
        this.lado = lado;
        this.apotema = apotema;
    }

    @Override
    public double calcularArea() {
        return ((5 * lado) * apotema) / 2;
    }

    @Override
    public double calcularPerimetro() {
        return 5 * lado;
    }
}
