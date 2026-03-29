package ro.ase.cts.clase;

import org.w3c.dom.html.HTMLOptionElement;

public class RegistruSpital {
    private String numeSectie;
    private int numarSaloane;
    private int numarPacienti;
    private int numarSaloaneOcupate;

    public void afisareOcupareSalon() {
        if (numarSaloane == numarSaloaneOcupate) {
            System.out.println("Nu mai sunt locuri!");
        } else {
            System.out.println("Salonul a fost ocupat");
            numarSaloaneOcupate++;
        }
    }

    private static RegistruSpital instanta = null;

    public RegistruSpital(String numeSectie, int numarSaloane, int numarPacienti) {
        this.numeSectie = numeSectie;
        this.numarSaloane = numarSaloane;
        this.numarPacienti = numarPacienti;
        this.numarSaloaneOcupate = 0;
    }

    public void afisareDescriere() {
        StringBuilder sb = new StringBuilder();
        sb.append(numeSectie).append(", numar saloane: ");
        sb.append(numarSaloane).append(", numarPacienti:");
        sb.append(numarPacienti).append(".");
        System.out.println(sb.toString());
    }

    public static synchronized RegistruSpital getInstance(String numeSectie, int numarSaloane, int numarPacienti) {
        if (instanta == null) {
            instanta = new RegistruSpital(numeSectie, numarSaloane, numarPacienti);
        }
        return instanta;
    }
}
