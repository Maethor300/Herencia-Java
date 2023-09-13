package Electrodomestico;

import Lavadora.Lavadora;
import Televisor.Televisor;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ElectrodomesticoTest {

    @Test
    public void verificacionCreate(){
        Electrodomestico electrodomestico = new Electrodomestico("Lavadora","gris",'a',20);
        Electrodomestico electrodomesticoOtro = new Electrodomestico("Lavadora","gris",'a',20);
        ArrayList<Electrodomestico> electrodomesticos1 = new ArrayList<>();
        electrodomestico.obtenerDatos(electrodomesticos1,electrodomestico);
        electrodomestico.obtenerDatos(electrodomesticos1,electrodomesticoOtro);
        assertTrue(electrodomesticos1.size()>1);
    }

    @Test
    public void verificiacionOperacionLavadora(){
        Lavadora lavadora1 = new Lavadora("Lavadora","gris",'a',20,29);
        assertEquals(1500, lavadora1.getPrecio());
    }
    @Test
    public void verificiacionOperacionTelevisor(){
        Televisor televisor1 = new Televisor("Tv","Negro",'c',7,41,true);
        assertEquals(1410, televisor1.getPrecio());
    }

}