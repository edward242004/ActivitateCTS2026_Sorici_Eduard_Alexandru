package ro.ase.cts.factory;

import ro.ase.cts.clase.*;
import ro.ase.cts.enums.TipEvent;
import ro.ase.cts.enums.TipIntalnire;

public class FabricaIntalnire implements FabricaEvent {
    @Override
    public Event creeazaIntalnire(String data, String title, TipEvent tip) {
        return switch (tip){
            case TipIntalnire.Conferinta -> new Conferinta(data,title);
            case TipIntalnire.WebinarOnline -> new WebinarOnline(data,title);
            case TipIntalnire.Workshop -> new Workshop(data,title);
            default -> null;
        };
    }
}
