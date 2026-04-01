package ro.ase.cts.clase;

public class Transport {

    private boolean hasWiFi;
    private boolean hasPet;
    private boolean hasSmoke;
    private boolean hasTelevizor;
    private boolean hasAC;

    public Transport(boolean hasWiFi, boolean hasAC, boolean hasTelevizor, boolean hasPet, boolean hasSmoke) {
        this.hasWiFi = hasWiFi;
        this.hasAC = hasAC;
        this.hasTelevizor = hasTelevizor;
        this.hasPet = hasPet;
        this.hasSmoke = hasSmoke;
    }

}
