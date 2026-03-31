package ro.ase.cts.clase;

public class CodRosu extends Alerta{

    public CodRosu(String numeSectie, String numeSpital) {
        super(numeSectie, numeSpital);
    }
    @Override
    public void afisareDescriere() {
        System.out.println("Cod rosu"+super.toString());
    }
}
