package Animal;

import Caballo.Caballo;
import Gato.Gato;
import Perro.Perro;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {
    @Test
    public void testPerro(){
        Perro perro = new Perro("Firulais","Carne",7,"Pastor Aleman");
        assertEquals("Carne", perro.alimentarse());
    }
    @Test
    public void testGato(){
        Gato gato = new Gato("Motito","Croquetas",9,"criollo");
        assertEquals("Croquetas",gato.alimentarse());
    }
    @Test
    public void testCaballo(){
        Caballo caballo = new Caballo("El rayo","Pasto",12,"Arabes");
        assertEquals("Pasto", caballo.alimentarse());
    }
}