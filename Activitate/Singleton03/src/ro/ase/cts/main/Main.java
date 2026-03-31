package ro.ase.cts.main;

import ro.ase.cts.clase.CasaMarcat;

public class Main {
    public static void main(String[] args) {
        CasaMarcat casa1 = CasaMarcat.getInstance(1, 2);
        CasaMarcat casa2 = CasaMarcat.getInstance(2, 5);
        casa1.afisareDescriere();
        casa1.afisareTranzactionare();
        casa1.afisareTranzactionare();
        casa1.afisareTranzactionare();
        casa1.afisareDescriere();
        casa2.afisareDescriere();
        casa2.afisareTranzactionare();
    }
}
