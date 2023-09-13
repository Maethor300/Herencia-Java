package CalculosFormas;

import Circulo.Circulo;
import Rectangulo.Rectangulo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculosFormasTest {
      @Test
      public void calcularAreaYPerimetroCirculo(){
          Circulo circulo1= new Circulo(100);
          assertEquals(31415.9,circulo1.calcularArea());
          assertEquals(628.3,circulo1.calcularPerimetro());
      }
      @Test
      public void calcularAreaYPerimetroRectangulo(){
          Rectangulo rectangulo = new Rectangulo(5,5);
          assertEquals(25.0,rectangulo.calcularArea());
          assertEquals(20.0,rectangulo.calcularPerimetro());
      }
}