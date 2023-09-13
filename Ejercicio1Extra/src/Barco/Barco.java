package Barco;

import Alquiler.Alquiler;

import java.time.LocalTime;
import java.util.Scanner;

class Barco extends Alquiler {
    private String matricula;
    private double tamañoEslora;
    private LocalTime añoFabricacion;

    public Barco(String name, int ID, LocalTime fechaAlquiler, LocalTime fechaDevolucion, int posicionAmarre, String matricula, double tamañoEslora, LocalTime añoFabricacion) {
        super(name, ID, fechaAlquiler, fechaDevolucion, posicionAmarre);
        this.matricula = matricula;
        this.tamañoEslora = tamañoEslora;
        this.añoFabricacion = añoFabricacion;
    }
    public void crearBarco(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digita el nombre del cliente");
        String nameCliente = scanner.nextLine();
        this.name = nameCliente;
    }
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getTamañoEslora() {
        return tamañoEslora;
    }

    public void setTamañoEslora(double tamañoEslora) {
        this.tamañoEslora = tamañoEslora;
    }

    public LocalTime getAñoFabricacion() {
        return añoFabricacion;
    }

    public void setAñoFabricacion(LocalTime añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }
}
