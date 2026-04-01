package ro.ase.cts.clase;

public class SearchingFilterBuilder implements AbstractSearchingFilter {
    private String titlu;
    private int anAparitie;
    private String gen;
    private String actori;
    private double rating;
    private String regizor;

    public SearchingFilterBuilder() {
        this.titlu = "Standard";
        this.anAparitie = 000;
        this.gen = "Standard";
        this.actori = "Standard";
        this.rating = 000;
        this.regizor = "Standard";
    }

    @Override
    public SearchingFilter build() {
        return new SearchingFilter(titlu, regizor, rating, actori, gen, anAparitie);
    }

    @Override
    public AbstractSearchingFilter setActori(String actori) {
        this.actori = actori;
        return this;
    }

    @Override
    public AbstractSearchingFilter setRating(double rating) {
        this.rating = rating;
        return this;
    }

    @Override
    public AbstractSearchingFilter setTitlu(String titlu) {
        this.titlu = titlu;
        return this;
    }

    @Override
    public AbstractSearchingFilter setAnAparitie(int anAparitie) {
        this.anAparitie = anAparitie;
        return this;
    }

    @Override
    public AbstractSearchingFilter setRegizor(String regizor) {
        this.regizor = regizor;
        return this;
    }

    @Override
    public AbstractSearchingFilter setGen(String gen) {
        this.gen = gen;
        return this;
    }
}
