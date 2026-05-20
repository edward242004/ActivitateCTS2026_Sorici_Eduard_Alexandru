package ro.ase.cts.clase;

public class Pacient implements IPacient {
    private String nume;
    private String nrTelefon;
    private String email;

    public Pacient(String nume, String nrTelefon, String email) {
        this.nume = nume;
        this.nrTelefon = nrTelefon;
        this.email = email;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(" Numele ").append(nume);
        sb.append(", nrTelefon ").append(nrTelefon);
        sb.append(", email ").append(email);
        return sb.toString();
    }

    @Override
    public void afiseazaDescriere(Internare internare) {
        System.out.println("Pacientul: " + this.nume + " [Tel: " + nrTelefon + ", Email: " + email + "]");
        System.out.println("Detalii internare curenta " + internare);
    }
}
