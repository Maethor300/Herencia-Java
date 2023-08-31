package EnumConsumo;

public enum ConsumoEnergia {
    A(1000),B(800),C(600),D(500),E(300),F(100);
    private final int number;
    ConsumoEnergia(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
