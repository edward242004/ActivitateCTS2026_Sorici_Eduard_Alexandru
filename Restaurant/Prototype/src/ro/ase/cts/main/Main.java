package ro.ase.cts.main;

import ro.ase.cts.clase.PrototypeRezervare;
import ro.ase.cts.clase.Rezervare;

public class Main {
    public static void main(String[] args) {
        PrototypeRezervare rezervare = new Rezervare("Ion", 3, "16:00", "0773193200");
        PrototypeRezervare rezervare2 = rezervare.copiaza();
        ((Rezervare) rezervare2).setNrPersoane(4);
        ((Rezervare) rezervare2).setOra("12:00");
        System.out.println(rezervare);
        System.out.println(rezervare2);

    }
}
