package Vivienda;

import Familias.Familias;

import java.util.ArrayList;
import java.util.Scanner;

public class Vivienda {
    private int numeroDormitorios;
    private String tipoParedes;
    private String tipoPiso;
    private boolean iluminacion;
    private Familias familias;
    public Vivienda(){

    }

    public Vivienda(int numeroDormitorios, String tipoParedes, String tipoPiso, boolean iluminacion, Familias familias ) {
        this.numeroDormitorios = numeroDormitorios;
        this.tipoParedes = tipoParedes;
        this.tipoPiso = tipoPiso;
        this.iluminacion = iluminacion;
        this.familias = familias;
    }

    public void crearVivienda(ArrayList<Vivienda> viviendas1,Familias familias){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Numero de dormitorios");
        int numeroDeDormitorio = scanner.nextInt();
        System.out.println("Digita el tipo de pared");
        String tipoParedes = scanner.next();
        System.out.println("Digita el tipo de piso");
        String tipoPiso = scanner.next();
        System.out.println("Digita si tiene iluminacion o no");
        boolean iluminacion = scanner.nextBoolean();
        viviendas1.add(new Vivienda(numeroDeDormitorio,tipoParedes,tipoPiso,iluminacion,familias));
    }

    public int getNumeroDormitorios() {
        return numeroDormitorios;
    }

    public void setNumeroDormitorios(int numeroDormitorios) {
        this.numeroDormitorios = numeroDormitorios;
    }

    public String getTipoParedes() {
        return tipoParedes;
    }

    public void setTipoParedes(String tipoParedes) {
        this.tipoParedes = tipoParedes;
    }

    public String getTipoPiso() {
        return tipoPiso;
    }

    public void setTipoPiso(String tipoPiso) {
        this.tipoPiso = tipoPiso;
    }

    public boolean isIluminacion() {
        return iluminacion;
    }

    public void setIluminacion(boolean iluminacion) {
        this.iluminacion = iluminacion;
    }

    @Override
    public String toString() {
        return "Vivienda{" +
                "numeroDormitorios=" + numeroDormitorios +
                ", tipoParedes='" + tipoParedes + '\'' +
                ", tipoPiso='" + tipoPiso + '\'' +
                ", iluminacion=" + iluminacion +
                ", familias=" + familias;
    }
}
