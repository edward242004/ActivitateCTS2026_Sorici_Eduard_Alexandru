package ro.ase.cts.main;


import ro.ase.cts.clase.bar.Printer;
import ro.ase.cts.clase.bar.PrinterAdapter;

public class Main {
    public static void main(String[] args) {
        Printer printerBar = new Printer("150lei,ora 11:40PM");
        ro.ase.cts.clase.bucatarie.Printer printerBucatarie = new ro.ase.cts.clase.bucatarie.Printer("200lei, ora 10:36PM");
        printerBucatarie.printeazaFactura();
        printerBar.printFactura();

        PrinterAdapter printerAdapter = new PrinterAdapter(printerBar);
        printerAdapter.printeazaFactura();



    }
}

