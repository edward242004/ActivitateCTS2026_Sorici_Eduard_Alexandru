package ro.ase.cts.main;


import ro.ase.cts.clase.Internare;
import ro.ase.cts.clase.Pacient;
import ro.ase.cts.clase.PacientAsigurat;

public class Main {
    public static void main(String[] args) {
        Internare internare = new Pacient("Gigel",false);
        Internare internare1 = new Pacient("Marius",true);
        internare1.interneaza();
        internare.interneaza();

        Internare internare2 = new PacientAsigurat(internare);
        Internare internare3 = new PacientAsigurat(internare1);
        internare2.interneaza();
        internare3.interneaza();
    }
}