package Main;

import Electrodomestico.Electrodomestico;
import Lavadora.Lavadora;
import Televisor.Televisor;

import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Electrodomestico> electrodomesticos = new ArrayList<>();
        Electrodomestico electrodomestico = new Electrodomestico();
        Lavadora lavadora1 = new Lavadora("Lavadora","gris",'a',20,29);
        Lavadora lavadora2 = new Lavadora("Lavadora","Amarillo",'a',22,50);
        Televisor televisor1 = new Televisor("Tv","Negro",'c',7,40,true);
        Televisor televisor2 = new Televisor("Tv Hd Plus","gris",'a',12,100,true);

         electrodomesticos.add(lavadora1);
         electrodomesticos.add(televisor1);
         electrodomesticos.add(televisor2 );
         electrodomesticos.add(lavadora2);
         double suma = lavadora1.getPrecio() + televisor1.getPrecio() + televisor2.getPrecio() + lavadora2.getPrecio();
        System.out.println(suma);
        for (Electrodomestico i : electrodomesticos
             ) {
            System.out.println(i);
        }
           do {
             System.out.println("------Menu------");
             System.out.println("1: Crear el electrodomestico");
             System.out.println("2: Monstrar info");
               System.out.println("3: Mostrar info en data");
             System.out.println("Digita un opcion:");
             int opcion = scanner.nextInt();
             switch (opcion){
                 case 1 -> electrodomestico.crearElectrodomestico(electrodomesticos);
                 case 2 -> {
                     System.out.println(electrodomestico.toString());
                 }
                 case 3 -> {
                     for (Electrodomestico i : electrodomesticos
                     ) {
                         System.out.println(i);
                     }
                     double sumarPrecio = electrodomestico.sumarPrecio(electrodomesticos);
                     System.out.println(sumarPrecio);
                 }
             }
         }while (true);
    }
}