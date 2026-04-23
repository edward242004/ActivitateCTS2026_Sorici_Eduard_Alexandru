package ro.ase.cts.clase;

public class ReceptieSpital {
    private Medic medic;
    private Salon salon;

    public ReceptieSpital(Medic medic, Salon salon) {
        this.medic = medic;
        this.salon = salon;
    }

    public void internarePacient(Pacient pacient) {
        if (pacient.getGravitate() > 6) {
            if (medic.areInregistrat(pacient)) {
                int patLiber = salon.getPatLiber();
                if (patLiber != -1) {
                    System.out.println("IL INTERNAM PE " + pacient.toString());
                    salon.ocupaPat(patLiber);
                } else {
                    System.out.println("Nu avem paturi libere");
                }
            } else {
                System.out.println("Trebuie trimitere de la medic");
            }
        } else {
            System.out.println("Nu e atat de grav");
        }
    }
}