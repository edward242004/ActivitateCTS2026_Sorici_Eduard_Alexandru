package ro.ase.cts.clase;

public class Rezervare implements PrototypeRezervare {
    private String numeClient;
    private int nrPersoane;
    private String ora;
    private String nrTelefon;

    public void setNrPersoane(int nrPersoane) {
        this.nrPersoane = nrPersoane;
    }

    public void setOra(String ora) {
        this.ora = ora;
    }

    public Rezervare(String numeClient, int nrPersoane, String ora, String nrTelefon) {
        if (numeClient.length() >= 0) {
            this.numeClient = numeClient;
        } else {
            this.numeClient = "Client";
        }
        if (nrPersoane > 0) {
            this.nrPersoane = nrPersoane;
        } else {
            System.out.println("format gresit");
        }
        this.ora = ora;
        if (nrTelefon.length() == 10) {
            this.nrTelefon = nrTelefon;
        } else {
            System.out.println("Format numar telefon gresit!");
        }

    }

    private Rezervare() {

    }

    @Override
    public PrototypeRezervare copiaza() {
        Rezervare rezervareNoua = new Rezervare();
        rezervareNoua.numeClient = this.numeClient;
        rezervareNoua.nrPersoane = this.nrPersoane;
        rezervareNoua.ora = this.ora;
        rezervareNoua.nrTelefon = this.nrTelefon;
        return rezervareNoua;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", nrPersoane=").append(nrPersoane);
        sb.append(", ora='").append(ora).append('\'');
        sb.append(", nrTelefon='").append(nrTelefon).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
