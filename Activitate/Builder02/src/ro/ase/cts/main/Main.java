package ro.ase.cts.main;

import ro.ase.cts.clase.AbstractTransport;
import ro.ase.cts.clase.Transport;
import ro.ase.cts.clase.TransportBuilder;

public class Main {
    public static void main(String[] args) {
        AbstractTransport builder = new TransportBuilder();
        Transport transport1 = builder.setHasWiFi(true).setHasPet(false).setHasAC(false).setHasSmoke(false).setHasTelevizor(true).build();
        System.out.println(transport1);
        transport1.setHasAC(true);
        System.out.println(transport1);

    }
}
