package ro.ase.cts.clase.bucatarie;

public class Printer {
    private String detaliiFactura;
    public void printeazaFactura(){
        System.out.println("A fost printata factura " + this.detaliiFactura);
    }

    public Printer(String detaliiFactura) {
        this.detaliiFactura = detaliiFactura;
    }

    public String getDetaliiFactura() {
        return detaliiFactura;
    }
}
