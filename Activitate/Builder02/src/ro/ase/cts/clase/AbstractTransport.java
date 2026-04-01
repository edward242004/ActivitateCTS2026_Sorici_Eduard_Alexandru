package ro.ase.cts.clase;

public interface AbstractTransport {
    Transport build();
    AbstractTransport setHasWiFi(boolean bool);
    AbstractTransport setHasAC(boolean bool);
    AbstractTransport setHasTelevizor(boolean bool);
    AbstractTransport setHasSmoke(boolean bool);
    AbstractTransport setHasPet(boolean bool);
}
