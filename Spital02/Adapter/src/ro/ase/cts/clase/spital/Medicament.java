package ro.ase.cts.clase.spital;

public class Medicament {
    private String numeMedicament;
    private double pretMedicament;


    public void achizitioneazaMedicament() {
        if (prezintaReteta()) {
            System.out.println("Este achizitionat medicamentul " + this.numeMedicament + " la pretul de " + this.pretMedicament);
        } else {
            System.out.println("Pentru medicamentul " + this.numeMedicament + " este nevoie de reteta!");
        }
    }

    public String getNumeMedicament() {
        return numeMedicament;
    }

    public Medicament(String numeMedicament, double pretMedicament) {
        this.numeMedicament = numeMedicament;
        this.pretMedicament = pretMedicament;
    }

    private boolean prezintaReteta() {
        return numeMedicament.contains("reteta");
    }


}
