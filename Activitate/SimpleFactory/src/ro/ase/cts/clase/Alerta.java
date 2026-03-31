package ro.ase.cts.clase;

public abstract class Alerta {
    String numeSectie;
    String numeSpital;

    public Alerta(String numeSectie, String numeSpital) {
        this.numeSectie = numeSectie;
        this.numeSpital = numeSpital;
    }

    public abstract void afisareDescriere();

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(" nume sectie ").append(numeSectie);
        sb.append(", nume spital ").append(numeSpital);
        return sb.toString();
    }
}
