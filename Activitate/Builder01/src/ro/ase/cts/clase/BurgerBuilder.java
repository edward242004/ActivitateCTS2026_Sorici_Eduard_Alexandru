package ro.ase.cts.clase;

public class BurgerBuilder implements AbstractBurger {

    private boolean hasSalata;
    private boolean hasRosii;
    private boolean hasBranzica;

    public BurgerBuilder() {
        this.hasSalata = false;
        this.hasBranzica = false;
        this.hasRosii = false;
    }

    @Override
    public Burger build() {
        return new Burger(hasSalata,hasBranzica,hasRosii);
    }

    @Override
    public AbstractBurger setHasSalata(boolean bool) {
        this.hasSalata=bool;
        return this;
    }

    @Override
    public AbstractBurger setHasRosii(boolean bool) {
        this.hasRosii=bool;
        return this;
    }

    @Override
    public AbstractBurger setHasBranzica(boolean bool) {
        this.hasBranzica=bool;
        return this;
    }
}
