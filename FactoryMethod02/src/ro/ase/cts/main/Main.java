package ro.ase.cts.main;

import ro.ase.cts.clase.MijlocTransport;
import ro.ase.cts.enums.TipBicicleta;
import ro.ase.cts.enums.TipDuba;
import ro.ase.cts.enums.TipMijlocTransport;
import ro.ase.cts.factory.FabricaBicicleta;
import ro.ase.cts.factory.FabricaDuba;
import ro.ase.cts.factory.FabricaTransport;

public class Main {
    public static void main(String[] args) {
        FabricaTransport fabrica1 = new FabricaBicicleta();
        MijlocTransport bicicletaElectrica = fabrica1.creeazaTransport(TipBicicleta.BicicletaElectrica,3,"RockRider");
        MijlocTransport bicicletaSimpla = fabrica1.creeazaTransport(TipBicicleta.BicicletaSimpla,5,"Pegas");
        bicicletaSimpla.livreazaComanda();
        bicicletaElectrica.livreazaComanda();
        System.out.println("Bicicletele au terminat livrarile de azi!");
        FabricaTransport fabrica2 = new FabricaDuba();
        MijlocTransport dubaDiesel = fabrica2.creeazaTransport(TipDuba.DubaDiesel,15,"Mercedes",7);
        dubaDiesel.livreazaComanda();
        System.out.println("Dubele au terminat livrarile de azi!");
    }
}
