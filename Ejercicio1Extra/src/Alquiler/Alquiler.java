package Alquiler;

import java.time.LocalTime;
import java.util.Scanner;

public class Alquiler {
    protected String name;
    protected int ID;
    protected LocalTime fechaAlquiler;
    protected LocalTime fechaDevolucion;
    protected int posicionAmarre;
    public Alquiler(){

    }
    public Alquiler(String name, int ID, LocalTime fechaAlquiler, LocalTime fechaDevolucion, int posicionAmarre) {
        this.name = name;
        this.ID = ID;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posicionAmarre = posicionAmarre;
    }
    public void calcularAlquiler(){

    }
}
