package ro.ase.cts.clase;

public abstract class BauturaAbstract implements Bautura{
    private String nume;
    private int pret;
    private int volum;

    public BauturaAbstract(String nume, int volum, int pret) {
        this.nume = nume;
        this.volum = volum;
        this.pret = pret;
    }

    @Override
    public int getPret() {
        return this.pret;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(" nume ").append(nume);
        sb.append(", pret ").append(pret);
        sb.append(", volum ").append(volum);
        return sb.toString();
    }
}
