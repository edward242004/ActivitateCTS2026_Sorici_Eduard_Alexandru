package ro.ase.cts.clase.bar;

import ro.ase.cts.clase.bucatarie.Printer;

public class PrinterAdapter extends Printer {
    ro.ase.cts.clase.bar.Printer printer;
    public PrinterAdapter(ro.ase.cts.clase.bar.Printer printer){
        super(printer.getDetaliiFactura());
        this.printer = printer;
    }

    @Override
    public void printeazaFactura() {
        this.printer.printFactura();
    }
}

