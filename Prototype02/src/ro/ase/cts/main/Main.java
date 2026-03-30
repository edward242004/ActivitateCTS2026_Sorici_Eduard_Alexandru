package ro.ase.cts.main;

import ro.ase.cts.clase.Contract;
import ro.ase.cts.clase.PrototypeContract;

public class Main {
    public static void main(String[] args) {
        PrototypeContract contract1 = new Contract("Premium",100,"don't share");
        PrototypeContract contract2 = contract1.copiaza();
        System.out.println(contract1);
        System.out.println(contract2);
        System.out.println("======================");
        ((Contract) contract2).setNumeClient("Iulian Gradinaru");
        ((Contract) contract2).setPret(150);
        ((Contract) contract1).setNumeClient("Marian Apostol");
        System.out.println("======================");

        System.out.println(contract2);
        System.out.println(contract1);
    }
}
