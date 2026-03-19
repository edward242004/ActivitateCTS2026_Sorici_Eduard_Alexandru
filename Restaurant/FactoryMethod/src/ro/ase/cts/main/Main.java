package ro.ase.cts.main;

import ro.ase.cts.clase.FelDeMancare;
import ro.ase.cts.clase.Papanasi;
import ro.ase.cts.clase.Supa;
import ro.ase.cts.enums.TipDesert;
import ro.ase.cts.enums.TipFelDeMancare;
import ro.ase.cts.enums.TipSupa;
import ro.ase.cts.factory.FabricaDesert;
import ro.ase.cts.factory.FabricaFelDeMancare;
import ro.ase.cts.factory.FabricaSupa;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        FabricaFelDeMancare fabricaFelDeMancare = new FabricaSupa();
        FelDeMancare supaDeVita = fabricaFelDeMancare.creeareFelDeMancare(TipSupa.SupaDeVita,200,100);
        FabricaFelDeMancare fabricaFelDeMancare1 = new FabricaDesert();
        FelDeMancare papanasi = fabricaFelDeMancare1.creeareFelDeMancare(TipDesert.Papanasi,200,100,500);
        supaDeVita.afisareDescriere();
        papanasi.afisareDescriere();
    }
}
