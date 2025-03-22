package Figurasgeometricas;

/**
 * @author JosueAldairMartínezVera
 * @author DarianGiselleSolisContreras
 * Clase que representa un Trapecio y permite calcular su área y perímetro.
 */
public class Trapecio extends Base {
    private double base_mayor;
    private double base_menor;
    private double altura;
    private double lado;

    public Trapecio(double base_mayor, double base_menor, double altura) {
        this.base_mayor = base_mayor;
        this.base_menor = base_menor;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return ((base_mayor + base_menor) * altura) / 2;
    }

    public void calcularLado() {
        double a = (base_mayor - base_menor) / 2;
        lado = Math.sqrt((a * a) + (altura * altura));
    }

    @Override
    public double calcularPerimetro() {
        calcularLado();
        return base_mayor + base_menor + (2 * lado);
    }
}
