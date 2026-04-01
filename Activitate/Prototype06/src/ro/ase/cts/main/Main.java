package ro.ase.cts.main;

import ro.ase.cts.clase.Event;
import ro.ase.cts.clase.Intalnire;
import ro.ase.cts.clase.TransmisiuneLive;
import ro.ase.cts.clase.Webinar;
import ro.ase.cts.enums.TipIntalnire;
import ro.ase.cts.factory.FabricaEvent;
import ro.ase.cts.factory.FabricaIntalnire;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FabricaEvent fabrica1 = new FabricaIntalnire();
        Event intalnire1 = fabrica1.creeazaIntalnire("20.01.2026","Intalnirea anului", TipIntalnire.WebinarOnline);
        intalnire1.broadcast();

        List<String> comentarii=new ArrayList<>();
        comentarii.add("1");
        comentarii.add("2");
        comentarii.add("3");
        comentarii.add("4");
        Webinar live1 = new TransmisiuneLive("Maruta",comentarii,"Salut");
        System.out.println(live1);
        Webinar live2 = ((TransmisiuneLive)live1).copiaza();
        System.out.println(live2);

    }
}
