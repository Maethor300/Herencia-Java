package Televisor;

import Electrodomestico.Electrodomestico;

import java.util.Scanner;

public class Televisor extends Electrodomestico {
    private int resolucion;
    private boolean sintonizador = false;

    public Televisor() {

    }
    public Televisor(String name, double precio, String color, char letras, double peso, int resolucion, boolean sintonizador) {
        super(name, precio, color, letras, peso);
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }
    public void crearTelevisor(){
        Scanner scanner = new Scanner(System.in);
        super.crearElectrodomestico();
        System.out.println("Cantidad de pulgadas");
        this.resolucion = scanner.nextInt();
        System.out.println("Tiene pulgadas 1 para si o 0 para no:");
        int descicion = scanner.nextInt();
        if(descicion == 1){
            this.sintonizador = true;
        }
        precioFinal();
    }
    public void precioFinal(){
        System.out.println(getPrecio());
        if(resolucion > 40){
            double precioActualMas30Porcentaje = precio * 0.30;
            System.out.println(precioActualMas30Porcentaje);
            setPrecio(getPrecio() + precioActualMas30Porcentaje );
        }
        if (sintonizador){
            setPrecio(getPrecio() + 500 );
        }
    }
    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(boolean sintonizador) {
        this.sintonizador = sintonizador;
    }

    @Override
    public String toString() {
        return "Televisor{" +
                "resolucion=" + resolucion +
                ", sintonizador=" + sintonizador +
                ", name='" + name + '\'' +
                ", precio=" + precio +
                ", color='" + color + '\'' +
                ", letras=" + letras +
                ", peso=" + peso +
                '}';
    }
}
