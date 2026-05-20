package ro.ase.cts.clase;

public class PacientAsigurat implements Internare {

    private Internare internare;

    public PacientAsigurat(Internare internare) {
        this.internare = internare;
    }

    @Override
    public void interneaza() {
        if (internare.getAreAsigurare() == true) {
            System.out.println("Pacientul " + internare.getNume() + " a fost internat!");
        } else {
            System.out.println("Pacientul " + internare.getNume() + " nu are asigurare!");
        }
    }

    @Override
    public String getNume() {
        return internare.getNume();
    }

    @Override
    public boolean getAreAsigurare() {
        return internare.getAreAsigurare();
    }
}
