package ro.ase.cts.clase;

public class SearchingFilter {

    private String titlu;
    private int anAparitie;
    private String gen;
    private String Actori;
    private double rating;
    private String regizor;

    public SearchingFilter(String titlu, String regizor, double rating, String actori, String gen, int anAparitie) {
        this.titlu = titlu;
        this.regizor = regizor;
        this.rating = rating;
        Actori = actori;
        this.gen = gen;
        this.anAparitie = anAparitie;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SearchingFilter{");
        sb.append("titlu='").append(titlu).append('\'');
        sb.append(", anAparitie=").append(anAparitie);
        sb.append(", gen='").append(gen).append('\'');
        sb.append(", Actori='").append(Actori).append('\'');
        sb.append(", rating=").append(rating);
        sb.append(", regizor='").append(regizor).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
