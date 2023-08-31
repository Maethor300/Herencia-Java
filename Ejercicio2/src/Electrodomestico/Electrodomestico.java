package Electrodomestico;
import EnumColores.Colores;
import EnumConsumo.ConsumoEnergia;

import java.util.Scanner;

public  class Electrodomestico {
    protected String name;
    protected double precio;
    protected String color;
    protected char letras;
    protected double peso;
    public Electrodomestico(){

    }

    public Electrodomestico(String name,double precio, String color, char letras, double peso) {
        this.name = name;
        this.precio = precio;
        this.color = color;
        this.letras = letras;
        this.peso = peso;
    }

    public void comprobarConsumoEnergetico(char letra){
           String letraToString = String.valueOf(letra);
        for (ConsumoEnergia i : ConsumoEnergia.values()
             ) {
            if (letraToString.equals(i.toString().toLowerCase())){
                this.letras = letra;
                  break;
            }else {
                letras = 'f';
            }
        }
    }
    public void comprobarColor(String color1){

        for (Colores i : Colores.values()
             ) {
            if(color1.equals(i.toString().toLowerCase())){
                this.color = color1;
                break;
            }else {
                color = "Blanco";
            }
        }
    }
    public void crearElectrodomestico(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digita el nombre");
        String name = scanner.nextLine();
        this.name = name;
        System.out.println("Digita el color:");
        String color = scanner.next();
        comprobarColor(color);
        System.out.println("La letra del Consumo:");
        String letra = scanner.next();
        char letraChar = letra.charAt(0);
        comprobarConsumoEnergetico(letraChar);
        System.out.println("Digita el peso:");
        double peso = scanner.nextDouble();
        this.peso = peso;
        precioFinal(peso,letra);
    }
    public void precioFinal(double peso, String letra){
        for (ConsumoEnergia i : ConsumoEnergia.values()
             ) {
            boolean equals = letra.equals(i.toString().toLowerCase());
            if(equals &&peso>1&&peso<=19){
                setPrecio(i.getNumber() + 100);

            } else if (equals &&peso>=20&&peso<=49) {
                setPrecio(i.getNumber() + 500);

            } else if (equals &&peso>=50&&peso<=79) {
                setPrecio(i.getNumber() + 800);

            }else if(equals &&peso>=80){
                setPrecio(i.getNumber() + 1000);
            }
        }
    }
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public  char getLetras() {
        return letras;
    }

    public void setLetras( char letras) {
        this.letras = letras;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    @Override
    public String toString() {
        return "Electrodomestico{" +
                "name='" + name + '\'' +
                ", precio=" + precio +
                ", color='" + color + '\'' +
                ", letras=" + letras +
                ", peso=" + peso + "Kg" +
                '}';
    }
}

