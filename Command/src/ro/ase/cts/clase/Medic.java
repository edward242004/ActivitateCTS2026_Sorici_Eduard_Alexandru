package ro.ase.cts.clase;

public class Medic implements PersonalSpital {
    private String numeM;

    public Medic(String numeM) {
        this.numeM = numeM;
    }

    @Override
    public void preluarePacient(Pacient pacient) {
        System.out.println("Medicul " + this.numeM + " interneaza pacientul: " + pacient.getNume());
    }

}
