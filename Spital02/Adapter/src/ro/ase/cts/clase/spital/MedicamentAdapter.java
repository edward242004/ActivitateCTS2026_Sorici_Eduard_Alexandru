package ro.ase.cts.clase.spital;

import ro.ase.cts.clase.farmacie.Medicament;

public class MedicamentAdapter extends Medicament {

    ro.ase.cts.clase.spital.Medicament medicamentSpital;

    public MedicamentAdapter(ro.ase.cts.clase.spital.Medicament medicamentSpital) {
        super(medicamentSpital.getNumeMedicament());
        this.medicamentSpital = medicamentSpital;
    }

    @Override
    public void cumparaMedicament() {
        medicamentSpital.achizitioneazaMedicament();
    }
}
