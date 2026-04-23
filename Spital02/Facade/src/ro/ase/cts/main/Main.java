package ro.ase.cts.main;

import ro.ase.cts.clase.Medic;
import ro.ase.cts.clase.Pacient;
import ro.ase.cts.clase.ReceptieSpital;
import ro.ase.cts.clase.Salon;

public class Main {
    public static void main(String[] args) {
        Pacient pacient1 = new Pacient("Ana", 7);
        Medic medic1 = new Medic();
        Salon salon1 = new Salon();
        if (pacient1.getGravitate() > 6) {
            if (medic1.areInregistrat(pacient1)) {
                int patLiber = salon1.getPatLiber();
                if (patLiber != -1) {
                    System.out.println("IL INTERNAM PE " + pacient1.toString());
                    salon1.ocupaPat(patLiber);
                }
            }
        }
        Pacient pacient2 = new Pacient("Ion", 2);
        Pacient pacient3 = new Pacient("Gigi", 9);
        Pacient pacient4 = new Pacient("Relu", 5);

        ReceptieSpital spital2 = new ReceptieSpital(medic1, salon1);
        spital2.internarePacient(pacient2);
        spital2.internarePacient(pacient3);
        spital2.internarePacient(pacient4);


    }
}