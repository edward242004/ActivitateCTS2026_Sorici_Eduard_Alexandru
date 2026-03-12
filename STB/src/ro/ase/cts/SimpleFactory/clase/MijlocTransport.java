package ro.ase.cts.SimpleFactory.clase;

public abstract class MijlocTransport {
    private String marca;
    private int linia;

    public MijlocTransport(String marca, int linia) {
        this.marca = marca;
        this.linia = linia;
    }

    public abstract void afisareDescriere();

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Marca: ").append(marca);
        sb.append(", Linia: ").append(linia);
        return sb.toString();
    }
}

