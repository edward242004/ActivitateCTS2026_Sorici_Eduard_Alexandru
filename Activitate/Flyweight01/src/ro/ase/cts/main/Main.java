package ro.ase.cts.main;

import ro.ase.cts.clase.Internare;
import ro.ase.cts.factory.PacientFactory;

public class Main {
    public static void main(String[] args) {
        Internare internare1 = new Internare(1,2,3,10);
        Internare internare2 = new Internare(2,3,3,14);

        PacientFactory fabrica = new PacientFactory();
        fabrica.getInternare("Gigel","0772392913","gigel@yahoo.com").afiseazaDescriere(internare1);
        fabrica.getInternare("Gigel","0772392913","gigel@yahoo.com").afiseazaDescriere(internare2);
    }
}