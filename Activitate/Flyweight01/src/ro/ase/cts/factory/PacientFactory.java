package ro.ase.cts.factory;

import ro.ase.cts.clase.IPacient;
import ro.ase.cts.clase.Pacient;

import java.util.HashMap;
import java.util.Map;

public class PacientFactory {
    public Map<String, IPacient> pacient = new HashMap<>();
    public IPacient getInternare(String nume, String numarTelefon,String email){
        if(pacient.containsKey(nume)){
            return pacient.get(nume);
        }else{
            IPacient pacient1 = new Pacient(nume,numarTelefon,email);
            pacient.put(nume,pacient1);
            return pacient1;
        }
    }
}