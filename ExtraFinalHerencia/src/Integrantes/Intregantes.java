package Integrantes;

import Familias.Familias;

import java.util.Scanner;

public class Intregantes     {
    private int numeroOrden;
    private String name;
    private String apellido;
    private int fechaDeNacimiento;
    private int DNI;
    private String sexo;
    private String vinculo;
     public Intregantes(){

     }


    public Intregantes(int numeroOrden, String name, int fecha, int dni, String sexo, String vinculo) {
         this.numeroOrden = numeroOrden;
        this.name = name;
        this.fechaDeNacimiento = fecha;
        this.DNI = dni;
        this.sexo = sexo;
        this.vinculo = vinculo;
    };

    public Intregantes crearIntegrantes(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digita el numero de orden");
        int numeroOrden = scanner.nextInt();

        System.out.println("Digita el Nombre");
        String name = scanner.next();

        System.out.println("Digita el fecha de nacimiento");
        int fecha = scanner.nextInt();

        System.out.println("Digita el DNI");
        int DNI = scanner.nextInt();

        System.out.println("Digita el sexo de la persona");
        String sexo = scanner.next();

        System.out.println("Digita el Vinculo Familiar");
        String vinculo = scanner.next();

        return new Intregantes(numeroOrden,name,fecha,DNI,sexo,vinculo);
    }

    @Override
    public String toString() {
        return "Intregantes{" +
                "numeroOrden=" + numeroOrden +
                ", name='" + name + '\'' +
                ", apellido='" + apellido + '\'' +
                ", fechaDeNacimiento=" + fechaDeNacimiento +
                ", DNI=" + DNI +
                ", sexo='" + sexo + '\'' +
                ", vinculo='" + vinculo + '\'' +
                '}';
    }
}
