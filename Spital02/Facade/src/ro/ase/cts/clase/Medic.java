package ro.ase.cts.clase;

public class Medic {


    public boolean areInregistrat(Pacient pacient) {
        return pacient.getGravitate() > 5;
    }

}
