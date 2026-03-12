package ro.ase.cts.lazy;

public class Hotel {
    private String denumireHotel;
    private int numarCamere;
    private int numarAngajati;
    private int numarCamereInchiriate;

    public void afisareInchiriereCamera() {
        if (numarCamereInchiriate == numarCamere) {
            System.out.println("Nu mai sunt camere disponibile!");
        } else {
            System.out.println("Camera a fost inchiriata.");
            numarCamereInchiriate++;
        }
    }

    public void afisareDescriere() {
        StringBuilder sb = new StringBuilder();
        sb.append(denumireHotel);
        sb.append(numarCamere);
        sb.append(numarAngajati);
        System.out.println(sb.toString());
    }

    private static Hotel instanta = null;

    public Hotel(String denumireHotel, int numarCamere, int numarAngajati) {
        this.denumireHotel = denumireHotel;
        this.numarCamere = numarCamere;
        this.numarAngajati = numarAngajati;
        this.numarCamereInchiriate = 0;
    }

    public static synchronized Hotel getInstance(String denumire, int nrCamere, int nrAngajati) {
        if (instanta == null) {
            instanta = new Hotel(denumire, nrCamere, nrAngajati);
        }
        return instanta;
    }
}
