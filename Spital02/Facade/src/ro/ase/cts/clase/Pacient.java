package ro.ase.cts.clase;

public class Pacient {
    private String nume;
    private int gravitate;

    public Pacient(String nume, int gravitate) {
        this.nume = nume;
        this.gravitate = gravitate;
    }

    public String getNume() {
        return nume;
    }

    public int getGravitate() {
        return gravitate;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(nume);
        return sb.toString();
    }
}
