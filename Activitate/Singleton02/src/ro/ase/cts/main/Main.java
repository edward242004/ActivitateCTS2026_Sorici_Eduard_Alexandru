package ro.ase.cts.main;

import ro.ase.cts.clase.RegistruSpital;

public class Main {
    public static void main(String[] args) {
        RegistruSpital registru1 = RegistruSpital.getInstance("ATI",2,1);
        RegistruSpital registru2 = RegistruSpital.getInstance("Pediatrie",2,1);
        registru1.afisareDescriere();
        registru1.afisareOcupareSalon();
        registru1.afisareOcupareSalon();
        registru2.afisareOcupareSalon();
        registru2.afisareOcupareSalon();
    }
}
