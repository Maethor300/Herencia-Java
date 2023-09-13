package Caballo;

import Animal.Animal;

public class Caballo extends Animal {
    public Caballo(String name, String alimento, int edad, String raza) {
        super(name, alimento, edad, raza);
    }
    public String alimentarse(){
         return this.alimento;
    }

    @Override
    public String toString() {
        return "Caballo{" +
                "name='" + name + '\'' +
                ", alimento='" + alimento + '\'' +
                ", edad=" + edad +
                ", raza='" + raza + '\'' +
                '}';
    }
}
