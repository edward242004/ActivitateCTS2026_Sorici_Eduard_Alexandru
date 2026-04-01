package ro.ase.cts.main;

import ro.ase.cts.clase.*;

public class Main {
    public static void main(String[] args) {
        AbstractMembership abonament1 = Membership.getInstance("Eduard", 200);
        abonament1.creeazaAbonament();
        AbstractMembership abonament2 = Membership.getInstance("Stefan", 150);
        abonament2.creeazaAbonament();
        Thread t = new Thread(() -> {
            AbstractMembership abonament3 = Membership.getInstance("Bolovan", 150);
            abonament3.creeazaAbonament();
        });
        t.start();

        AbstractSearchingFilter builder = new SearchingFilterBuilder();
        SearchingFilter filtru1 = builder.setActori("Dilinca si marius ").setAnAparitie(2001).setGen("male").setRating(9.99).setRegizor("Marius stancu").setTitlu("Dezamagitii").build();

        SearchingFilter filtru2 = builder.setActori("ileana si setfan ").setAnAparitie(2001).setGen("male").setRating(9.99).setRegizor("Marius stancu").setTitlu("Dezamagitii").build();

        SearchingFilter filtru3 = builder.setActori("Dilinca si beniamin ").setAnAparitie(2001).setGen("male").setRating(9.99).setRegizor("Marius stancu").setTitlu("Dezamagitii").build();
        System.out.println(filtru1);
        System.out.println(filtru2);
        System.out.println(filtru3);


    }
}
