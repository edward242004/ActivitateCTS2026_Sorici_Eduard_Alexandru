package ro.ase.cts.clase;

public class CasaMarcat {
    private int idCasa;
    private int nrTotalBonuri;
    private int nrBonuriPrintate;

    private CasaMarcat(int idCasa, int nrTotalBonuri) {
        this.idCasa = idCasa;
        this.nrTotalBonuri = nrTotalBonuri;
        this.nrBonuriPrintate = 0;
    }

    public void afisareTranzactionare() {
        if (nrTotalBonuri == nrBonuriPrintate) {
            System.out.println("Casa de marcat a ramas fara hartie!");
        } else {
            System.out.println("Tranzactie reusita!");
            nrBonuriPrintate++;
        }
    }

    private static CasaMarcat instanta = null;

    public static synchronized CasaMarcat getInstance(int idCasa, int nrTotalBonuri) {
        if (instanta == null) {
            instanta = new CasaMarcat(idCasa, nrTotalBonuri);
        }
        return instanta;
    }

    public void afisareDescriere() {
        StringBuilder sb = new StringBuilder();
        sb.append("Id casa: ").append(idCasa);
        sb.append(", numar de bonuri printate: ").append(nrBonuriPrintate);
        sb.append(", numar de bonuri ramase: ").append(nrTotalBonuri - nrBonuriPrintate);
        System.out.println(sb.toString());
    }
}
