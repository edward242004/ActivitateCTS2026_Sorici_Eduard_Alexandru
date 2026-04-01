package ro.ase.cts.clase;

public class Membership implements AbstractMembership {

    private String numeAbonat;
    private double pret;
    private boolean abonat;

    public Membership(String numeAbonat, double pret, boolean abonat) {
        this.numeAbonat = numeAbonat;
        this.pret = pret;
        this.abonat = abonat;
    }

    private Membership() {
    }

    private static Membership instanta = null;

    public static synchronized Membership getInstance(String numeAbonat,double pret) {
        if (instanta == null) {
            instanta = new Membership(numeAbonat,pret,false );
        }
        return instanta;
    }

    @Override
    public void creeazaAbonament() {
        if (abonat == true) {
            System.out.println("Deja abonat!");
        } else {
            System.out.println("Abonament creat!");
            abonat = true;
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Membership{");
        sb.append("numeAbonat='").append(numeAbonat).append('\'');
        sb.append(", pret=").append(pret);
        sb.append(", abonat=").append(abonat);
        sb.append('}');
        return sb.toString();
    }
}
