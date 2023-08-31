package Perro;

import Animal.Animal;

public class Perro extends Animal {
    public Perro(String name, String alimento, int edad, String raza){
        super(name,alimento,edad,raza);
    }
    public void alimentarse(){
        System.out.println("Alimentarse con: " + this.alimento);
    }

    @Override
    public String toString() {
        return "Perro{" +
                "name='" + name + '\'' +
                ", alimento='" + alimento + '\'' +
                ", edad=" + edad +
                ", raza='" + raza + '\'' +
                '}';
    }
}
