package Main;

import Electrodomestico.Electrodomestico;
import Lavadora.Lavadora;
import Televisor.Televisor;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Electrodomestico electrodomestico = new Electrodomestico();
         /*Lavadora lavadora = new Lavadora();
        lavadora.crearElectrodomestico();
        System.out.println(lavadora.toString());*/
         Televisor televisor = new Televisor();
         televisor.crearTelevisor();
        System.out.println(televisor.toString());
           /*do {
             System.out.println("------Menu------");
             System.out.println("1: Crear el electrodomestico");
             System.out.println("2: Monstrar info");
             System.out.println("Digita un opcion:");
             int opcion = scanner.nextInt();
             switch (opcion){
                 case 1 -> electrodomestico.crearElectrodomestico();
                 case 2 -> {
                     System.out.println(electrodomestico.toString());
                 }
             }
         }while (true);*/
    }
}