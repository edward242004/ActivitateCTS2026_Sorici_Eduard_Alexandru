package ro.ase.cts.SimpleFactory.clase;

public class Tramvai extends MijlocTransport{
    public Tramvai(String marca, int linia) {
        super(marca, linia);
    }

    @Override
    public void afisareDescriere() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tramvai")
                .append(super.toString());
        System.out.println(sb.toString());
    }
}
