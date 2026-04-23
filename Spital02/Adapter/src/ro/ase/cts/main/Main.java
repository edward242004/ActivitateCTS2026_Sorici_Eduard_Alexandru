package ro.ase.cts.main;

import ro.ase.cts.clase.spital.Medicament;
import ro.ase.cts.clase.spital.MedicamentAdapter;

public class Main {
    private static void procuraMedicamente(ro.ase.cts.clase.farmacie.Medicament medicamentFarmacie){




    }
    public static void main(String[] args) {
        Medicament medicamentSpital = new Medicament("Nurofen-reteta",10);
        ro.ase.cts.clase.farmacie.Medicament medicamentFarmacie =
                new ro.ase.cts.clase.farmacie.Medicament("Paracetamol");
        medicamentFarmacie.cumparaMedicament();
        medicamentSpital.achizitioneazaMedicament();
        procuraMedicamente(medicamentFarmacie);
        MedicamentAdapter medicamentAdapter = new MedicamentAdapter(medicamentSpital);
        procuraMedicamente(medicamentAdapter);
    }
}