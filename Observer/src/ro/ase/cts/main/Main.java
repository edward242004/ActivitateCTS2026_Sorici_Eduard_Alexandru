package ro.ase.cts.main;

import ro.ase.cts.clase.ISpital;
import ro.ase.cts.clase.Pacient;
import ro.ase.cts.clase.PacientAbonat;
import ro.ase.cts.clase.Spital;

public class Main {
    public static void main(String[] args) {
        Pacient pacient1 = new PacientAbonat("Ionescu",30);
        Pacient pacient2 = new PacientAbonat("Popescu",42);
        Pacient pacient3 = new PacientAbonat("Iliescu",31);
        Pacient pacient4 = new PacientAbonat("Georgescu",16);

        ISpital spitala = new Spital("Cantacuzino");
        spitala.aboneazaPacient(pacient1);
        spitala.aboneazaPacient(pacient2);
        spitala.aboneazaPacient(pacient3);
        spitala.aboneazaPacient(pacient4);

        ((Spital)spitala).notificaVirus();
        System.out.println("---------------------------------");
        ((Spital)spitala).notificaEpidemie();
    }
}
