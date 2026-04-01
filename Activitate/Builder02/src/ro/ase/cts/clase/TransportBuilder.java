package ro.ase.cts.clase;

public class TransportBuilder implements AbstractTransport {
    private boolean hasWiFi;
    private boolean hasPet;
    private boolean hasSmoke;
    private boolean hasTelevizor;
    private boolean hasAC;

    public TransportBuilder() {
        this.hasTelevizor=false;
        this.hasSmoke=false;
        this.hasPet=false;
        this.hasAC=false;
        this.hasWiFi=false;
    }

    @Override
    public AbstractTransport setHasWiFi(boolean bool) {
        this.hasWiFi=bool;
        return this;
    }

    @Override
    public AbstractTransport setHasAC(boolean bool) {
        this.hasAC=bool;
        return this;
    }

    @Override
    public AbstractTransport setHasTelevizor(boolean bool) {
        this.hasTelevizor=bool;
        return this;
    }

    @Override
    public AbstractTransport setHasSmoke(boolean bool) {
        this.hasSmoke=bool;
        return this;
    }

    @Override
    public AbstractTransport setHasPet(boolean bool) {
        this.hasPet=bool;
        return this;
    }

    @Override
    public Transport build() {
        return new Transport(hasWiFi,hasAC,hasTelevizor,hasPet,hasSmoke);
    }
}
