package ro.ase.cts.clase;

public class CodVerde extends Alerta {
    public CodVerde(String numeSectie, String numeSpital) {
        super(numeSectie, numeSpital);
    }

    @Override
    public void afisareDescriere() {
        System.out.println("Cod verde" + super.toString());
    }
}
