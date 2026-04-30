package ro.ase.cts.clase;

public class AutobuzCursaSpeciala implements MijlocTransport {
    private MijlocTransport mijlocTransport;

    public AutobuzCursaSpeciala(MijlocTransport mijlocTransport) {
        this.mijlocTransport = mijlocTransport;
    }

    public AutobuzCursaSpeciala() {
        super();
    }

    @Override
    public void opresteInStatie() {
        if (mijlocTransport.getLinie().toLowerCase().contains("speciala")) {
            System.out.println("Autobuzul are un traseu special");
        } else {
            mijlocTransport.opresteInStatie();
        }
    }

    @Override
    public int getNrCalatori() {
        return mijlocTransport.getNrCalatori();
    }

    @Override
    public String getLinie() {
        return mijlocTransport.getLinie();
    }
}
