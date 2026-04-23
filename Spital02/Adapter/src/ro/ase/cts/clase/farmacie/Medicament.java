package ro.ase.cts.clase.farmacie;

public class Medicament {
    private String numeMedicament;

    public void cumparaMedicament() {
        System.out.println("Este cumparat medicamentul " + this.numeMedicament + " de la farmacie");
    }

    public String getNumeMedicament() {
        return numeMedicament;
    }

    public Medicament(String numeMedicament) {
        this.numeMedicament = numeMedicament;
    }
}
