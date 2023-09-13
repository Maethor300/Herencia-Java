package Gato;

import Animal.Animal;

public class Gato extends Animal {

    public Gato(String name, String alimento, int edad, String raza) {
        super(name, alimento, edad, raza);
    }

    public String alimentarse() {
        return this.alimento;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "name='" + name + '\'' +
                ", alimento='" + alimento + '\'' +
                ", edad=" + edad +
                ", raza='" + raza + '\'' +
                '}';
    }
}
