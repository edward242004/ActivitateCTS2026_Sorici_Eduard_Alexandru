package ro.ase.cts.clase;

public abstract class Duba implements MijlocTransport {
    private double costTransport;
    private String marca;
    private double consum;


    public Duba(double costTransport, String marca, double consum) {
        this.costTransport = costTransport;
        this.marca = marca;
        this.consum = consum;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(", marca duba: ").append(marca);
        sb.append(", cost transport: ").append(costTransport);
        sb.append(", consum: ").append(consum);
        return sb.toString();
    }
}
