package Circulo;

import CalculosFormas.CalculosFormas;

public class Circulo implements CalculosFormas {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }
    @Override
    public double calcularArea() {

        return Math.round( PI * radio * radio * 10.0) / 10.0;
    }

    @Override
    public double calcularPerimetro() {
          return Math.round(2*PI * radio * 10.0) / 10.0 ;
    }
}
