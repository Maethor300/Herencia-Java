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

        ArrayList<String> electrodomesticos = new ArrayList<>();
        Lavadora lavadora1 = new Lavadora("Lavadora","gris",'a',20,29);
        Lavadora lavadora2 = new Lavadora("Lavadora","Blanca",'a',22,50);
        Televisor televisor1 = new Televisor("Tv","Negro",'c',7,40,true);
        Televisor televisor2 = new Televisor("Tv Hd Plus","gris",'a',12,100,true);

         electrodomesticos.add(lavadora1.toString());
         electrodomesticos.add(televisor1.toString());
         electrodomesticos.add(televisor2.toString());
         electrodomesticos.add(lavadora2.toString());
         double suma = lavadora1.getPrecio() + televisor1.getPrecio() + televisor2.getPrecio() + lavadora2.getPrecio();
         electrodomesticos.add("Total Valor : "+ suma);
        for (String i : electrodomesticos
             ) {
            System.out.println(i);
        }
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