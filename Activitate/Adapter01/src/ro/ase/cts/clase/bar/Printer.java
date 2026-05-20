package ro.ase.cts.clase.bar;

public class Printer {
    private String detaliiFactura;

    public void printFactura() {
        System.out.println("Factura printata la bar " + detaliiFactura);
    }

    public Printer(String detaliiFactura) {
        this.detaliiFactura = detaliiFactura;
    }

    public String getDetaliiFactura() {
        return detaliiFactura;
    }
}
