package Gato;

import Animal.Animal;

public class Gato extends Animal {

    public Gato(String name, String alimento, int edad, String raza) {
        super(name, alimento, edad, raza);
    }

    public void alimentarse() {
        System.out.println("Alimentarse con: " + alimento);
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
