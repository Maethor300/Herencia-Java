package Main;

import Familias.Familias;
import Integrantes.Intregantes;
import Vivienda.Vivienda;

import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ArrayList<Vivienda> viviendas1 = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Vivienda vivienda = new Vivienda();
        Familias familias = new Familias();
         do {
             System.out.println("-----Menu-----");
             System.out.println("1:Crear Familia");
             System.out.println("2:Mostrar Data");
             System.out.println("Digita una opcion");
             int opcion = scanner.nextInt();
             switch (opcion){
              case 1 -> {
                  Familias data = familias.crearFamilia();
                  vivienda.crearVivienda(viviendas1,data);

              }
              case 2 -> {
                  for (Vivienda i : viviendas1
                       ) {
                      System.out.println(i);
                  }
              }
             }
         }while(true);
    }
}