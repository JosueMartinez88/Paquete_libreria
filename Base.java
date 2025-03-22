package Figurasgeometricas;

/**
 * @author JosueAldairMartínezVera
 * @author DarianGiselleSolisContreras
 * Clase abstracta que sirve como base para todas las figuras geométricas.
 * Define los métodos para calcular el área y el perímetro.
 * 
 */
public abstract class Base {
    /**
     * Método abstracto para calcular el área de la figura.
     * @return El área de la figura.
     */
    public abstract double calcularArea();

    /**
     * Método abstracto para calcular el perímetro de la figura.
     * @return El perímetro de la figura.
     */
    public abstract double calcularPerimetro();
}
