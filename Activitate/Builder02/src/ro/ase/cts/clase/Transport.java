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

    public void setHasWiFi(boolean hasWiFi) {
        this.hasWiFi = hasWiFi;
    }

    public void setHasPet(boolean hasPet) {
        this.hasPet = hasPet;
    }

    public void setHasSmoke(boolean hasSmoke) {
        this.hasSmoke = hasSmoke;
    }

    public void setHasTelevizor(boolean hasTelevizor) {
        this.hasTelevizor = hasTelevizor;
    }

    public void setHasAC(boolean hasAC) {
        this.hasAC = hasAC;
    }

    public boolean isHasAC() {
        return hasAC;
    }

    public boolean isHasWiFi() {
        return hasWiFi;
    }

    public boolean isHasPet() {
        return hasPet;
    }

    public boolean isHasSmoke() {
        return hasSmoke;
    }

    public boolean isHasTelevizor() {
        return hasTelevizor;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Transportul ");
        sb.append("has WiFi ").append(hasWiFi);
        sb.append(", hasPet ").append(hasPet);
        sb.append(", hasSmoke ").append(hasSmoke);
        sb.append(", hasTelevizor ").append(hasTelevizor);
        sb.append(", hasAC ").append(hasAC);
        sb.append('.');
        return sb.toString();
    }
}
