package Main;

import Caballo.Caballo;
import Gato.Gato;
import Perro.Perro;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
         Gato gato = new Gato("Motito","Croquetas",9,"criollo");
        System.out.println(gato);
         gato.alimentarse();
         Perro perro = new Perro("Firulais","Carne",7,"Pastor Aleman");
        System.out.println(perro);
        perro.alimentarse();
         Caballo caballo = new Caballo("El rayo","Pasto",12,"Arabes");
        System.out.println(caballo);
        caballo.alimentarse();
    }
}