package ro.ase.cts.clase;

public class Autobuz implements MijlocTransport {
    private String linia;
    private int nrCalatori;

    public Autobuz(String linia, int nrCalatori) {
        this.linia = linia;
        this.nrCalatori = nrCalatori;
    }

    public int getNrCalatori() {
        return nrCalatori;
    }

    @Override
    public String getLinie() {
        return linia;
    }

    @Override
    public void opresteInStatie() {
        System.out.println("Autobuzul " + linia + " a oprit in statie!");
    }
}
