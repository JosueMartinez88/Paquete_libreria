
package Figurasgeometricas;

import Figurasgeometricas.*;

/**
 * @author JosueAldairMartínezVera
 * @author DarianGiselleSolisContreras
 */
public class Ejemplos {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(5); //Radio de 5
        System.out.println("Área del círculo: " + circulo.calcularArea());
        System.out.println("Perímetro del círculo: " + circulo.calcularPerimetro());
        
        Rectangulo rectangulo = new Rectangulo(8, 4); //Base 8 y tiene una altura de 4
        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
        System.out.println("Perímetro del rectángulo: " + rectangulo.calcularPerimetro());
        
        Hexagono hexagono = new Hexagono(6, 5.2); //Lado de 6 y tiene un apotema de 5.2
        System.out.println("Área del hexágono: " + hexagono.calcularArea());
        System.out.println("Perímetro del hexágono: " + hexagono.calcularPerimetro());
    }
}
