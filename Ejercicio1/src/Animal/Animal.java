package Animal;

public class Animal {
    protected String name;
    protected String alimento;
    protected int edad;
    protected String raza;

    public Animal(String name, String alimento, int edad, String raza) {
        this.name = name;
        this.alimento = alimento;
        this.edad = edad;
        this.raza = raza;
    }
    public void alimentarse(){
        System.out.println("Alimentarse");
    }
}
