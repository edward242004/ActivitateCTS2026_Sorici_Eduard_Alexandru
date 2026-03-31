package ro.ase.cts.clase;

public abstract class Bicicleta implements MijlocTransport {
    private double costTransport;
    private String marca;

    public Bicicleta(String marca, double costTransport) {
        this.marca = marca;
        this.costTransport = costTransport;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(" marca bicicleta: ").append(marca);
        sb.append(", cost transport: ").append(costTransport);
        return sb.toString();
    }
}
