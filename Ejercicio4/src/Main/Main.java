package Main;

import Circulo.Circulo;
import Rectangulo.Rectangulo;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Circulo circulo1= new Circulo(45);
        System.out.println("Area Circulo: " + circulo1.calcularArea());
        System.out.println("Perimetro Del Circulo:" + circulo1.calcularPerimetro());
        Rectangulo rectangulo = new Rectangulo(5,5);
        System.out.println("Area de Rectangulo:" + rectangulo.calcularArea());
        System.out.println("Perimetro del Rectangulo:" +rectangulo.calcularPerimetro());
    }
}