package ro.ase.cts.clase;

public interface AbstractBurger {
    Burger build();
    AbstractBurger setHasBranzica(boolean bool);
    AbstractBurger setHasRosii(boolean bool);
    AbstractBurger setHasSalata(boolean bool);
}
