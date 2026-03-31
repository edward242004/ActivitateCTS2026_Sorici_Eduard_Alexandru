package ro.ase.cts.clase;

public class CodGalben extends Alerta {
    public CodGalben(String numeSectie, String numeSpital) {
        super(numeSectie, numeSpital);
    }

    @Override
    public void afisareDescriere() {
        System.out.println("Cod galben " + super.toString());
    }
}
