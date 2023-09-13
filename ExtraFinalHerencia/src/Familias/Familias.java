package Familias;

import Integrantes.Intregantes;
import Vivienda.Vivienda;

import java.util.ArrayList;
import java.util.Scanner;

public class Familias extends Vivienda {
    protected String direccion;
    protected String IDE;
    protected int numeroLote;
    protected String barrio;
    protected String localidad;
    protected Intregantes intregantes;

    public Familias(){

    }
    public Familias(String direccion, String IDE, int numeroLote, String barrio, String localidad,Intregantes intregantes) {
        this.direccion = direccion;
        this.IDE = IDE;
        this.numeroLote = numeroLote;
        this.barrio = barrio;
        this.localidad = localidad;
        this.intregantes = intregantes;
    }

    public Familias(int numeroDormitorios, String tipoParedes, String tipoPiso, boolean iluminacion, Familias familias, String direccion, String IDE, int numeroLote, String barrio, String localidad) {
        super(numeroDormitorios, tipoParedes, tipoPiso, iluminacion,familias);
        this.direccion = direccion;
        this.IDE = IDE;
        this.numeroLote = numeroLote;
        this.barrio = barrio;
        this.localidad = localidad;
    }
    public Familias crearFamilia(){
        Intregantes intregantes1 = new Intregantes();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digita la direccion");
        String direccion = scanner.next();
        System.out.println("Digita el IDE");
        String IDE = scanner.next();
        System.out.println("Digita el numeroLote");
        int numeroLote = scanner.nextInt();
        System.out.println("Digita el Barrio");
        String barrio = scanner.next();
        System.out.println("Digita el Localidad");
        String localidad = scanner.next();
        Intregantes intregantes = intregantes1.crearIntegrantes();
        return new Familias(direccion,IDE,numeroLote,barrio,localidad,intregantes);
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getIDE() {
        return IDE;
    }

    public void setIDE(String IDE) {
        this.IDE = IDE;
    }

    public int getNumeroLote() {
        return numeroLote;
    }

    public void setNumeroLote(int numeroLote) {
        this.numeroLote = numeroLote;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    @Override
    public String toString() {
        return "Familias{" +
                "direccion='" + direccion + '\'' +
                ", IDE='" + IDE + '\'' +
                ", numeroLote=" + numeroLote +
                ", barrio='" + barrio + '\'' +
                ", localidad='" + localidad + '\'' +
                 "Integrante:" + intregantes;
    }
}
