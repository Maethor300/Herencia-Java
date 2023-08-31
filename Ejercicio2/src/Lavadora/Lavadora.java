package Lavadora;

import Electrodomestico.Electrodomestico;

import java.util.Scanner;

public class Lavadora extends Electrodomestico {
    private int carga;

    public Lavadora() {

    }
    public Lavadora(String name, double precio, String color, char letras, double peso, int carga) {
        super(name, precio, color, letras, peso);
        this.carga = carga;
    }
    @Override
    public void crearElectrodomestico(){
        super.crearElectrodomestico();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digita la carga");
        this.carga = scanner.nextInt();
        precioFinal();
    }

    public void precioFinal(){

        if(carga > 30){
           setPrecio(getPrecio() + 500);
        }
    }
    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return "Lavadora{" +
                "carga=" + carga +
                ", name='" + name + '\'' +
                ", precio=" + precio +
                ", color='" + color + '\'' +
                ", letras=" + letras +
                ", peso=" + peso +
                '}';
    }
}
