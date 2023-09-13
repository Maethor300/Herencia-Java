package AbordajeNutricional;

import ProblemaSalud.ProblemaSalud;

public class AbordajeNutricional extends ProblemaSalud {
    private int numeroDelIntegrante;
    private double peso;
    private int edad;
    private boolean eutrofico;
    private boolean bajoPeso;
    private boolean sobrePeso;

    public AbordajeNutricional(int numeroDormitorios, String tipoParedes, String tipoPiso, boolean iluminacion, String direccion, String IDE, int numeroLote, String barrio, String localidad, int numeroOrden, String name, String apellido, int fechaDeNacimiento, int DNI, String sexo, String vinculo, int numeroOrden1, String IDE1, boolean HTA, boolean DBT, int numeroDelIntegrante, double peso, int edad, boolean eutrofico, boolean bajoPeso, boolean sobrePeso) {
        super(numeroDormitorios, tipoParedes, tipoPiso, iluminacion, direccion, IDE, numeroLote, barrio, localidad, numeroOrden, name, apellido, fechaDeNacimiento, DNI, sexo, vinculo, numeroOrden1, IDE1, HTA, DBT);
        this.numeroDelIntegrante = numeroDelIntegrante;
        this.peso = peso;
        this.edad = edad;
        this.eutrofico = eutrofico;
        this.bajoPeso = bajoPeso;
        this.sobrePeso = sobrePeso;
    }
}
