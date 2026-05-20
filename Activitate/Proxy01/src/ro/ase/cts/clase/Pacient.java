package ro.ase.cts.clase;

public class Pacient implements Internare {
    private String nume;
    private boolean areAsigurare;

    public Pacient(String nume, boolean areAsigurare) {
        this.nume = nume;
        this.areAsigurare = areAsigurare;
    }


    @Override
    public void interneaza() {
        System.out.println("Pacientul " + this.nume + " a fost internat!");
    }

    @Override
    public String getNume() {
        return this.nume;
    }

    @Override
    public boolean getAreAsigurare() {
        return this.areAsigurare;
    }

}
