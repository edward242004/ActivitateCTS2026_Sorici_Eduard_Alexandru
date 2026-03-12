package ro.ase.cts.SimpleFactory.clase;

public class Troleibuz extends MijlocTransport{
    public Troleibuz(String marca, int linia) {
        super(marca, linia);
    }

    @Override
    public void afisareDescriere() {
        StringBuilder sb = new StringBuilder();
        sb.append("Troleibuz")
                .append(super.toString());
        System.out.println(sb.toString());
    }
}
