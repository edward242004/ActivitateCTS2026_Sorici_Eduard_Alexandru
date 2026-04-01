package ro.ase.cts.factory;

import ro.ase.cts.clase.Event;
import ro.ase.cts.enums.TipEvent;

public interface FabricaEvent {
    Event creeazaIntalnire(String data, String title, TipEvent tip);
}
