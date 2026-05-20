package ro.ase.cts.clase;

public class Internare{
    private int idInternare;
    private int numarPat;
    private int numarSalon;
    private int zileSpitalizare;

    public Internare(int idInternare, int numarPat, int numarSalon, int zileSpitalizare) {
        this.numarPat = numarPat;
        this.numarSalon = numarSalon;
        this.zileSpitalizare = zileSpitalizare;
        this.idInternare = idInternare;

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(" id: ");
        sb.append(idInternare);
        sb.append(" numarPat ").append(numarPat);
        sb.append(", numarSalon ").append(numarSalon);
        sb.append(", zileSpitalizare ").append(zileSpitalizare);
        return sb.toString();
    }
}
