package ro.ase.cts.main;

import ro.ase.cts.clase.AbstractBurger;
import ro.ase.cts.clase.Burger;
import ro.ase.cts.clase.BurgerBuilder;

public class Main {
    public static void main(String[] args) {
        AbstractBurger builder = new BurgerBuilder();
        builder.setHasBranzica(true).setHasSalata(true).setHasRosii(true);
        Burger burger1 = builder.build();
        System.out.println(burger1);
        builder.setHasSalata(false).setHasBranzica(true).setHasRosii(true);
        Burger burger2 = builder.build();
        System.out.println(burger2);
    }
}
