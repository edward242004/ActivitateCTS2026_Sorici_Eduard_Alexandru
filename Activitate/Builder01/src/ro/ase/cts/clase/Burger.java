package ro.ase.cts.clase;

public class Burger {
    private boolean hasSalata;
    private boolean hasRosii;
    private boolean hasBranzica;

    public Burger(boolean hasSalata, boolean hasBranzica, boolean hasRosii) {
        this.hasSalata = hasSalata;
        this.hasBranzica = hasBranzica;
        this.hasRosii = hasRosii;
    }
    public boolean isHasSalata(){
        return hasSalata;
    }
    public boolean isHasRosii(){
        return hasRosii;
    }
    public boolean isHasBranzica(){
        return hasBranzica;
    }

    public void setHasSalata(boolean hasSalata) {
        this.hasSalata = hasSalata;
    }

    public void setHasRosii(boolean hasRosii) {
        this.hasRosii = hasRosii;
    }

    public void setHasBranzica(boolean hasBranzica) {
        this.hasBranzica = hasBranzica;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Burgerul ");
        sb.append(" has salata? ").append(hasSalata);
        sb.append(", has rosii? ").append(hasRosii);
        sb.append(", has branzica? ").append(hasBranzica);
        sb.append('.');
        return sb.toString();
    }
}
