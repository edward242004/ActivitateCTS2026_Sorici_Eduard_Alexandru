package ro.ase.cts.clase;

import java.util.ArrayList;
import java.util.List;

public interface ISpital {


    void trimiteMesaj(String mesaj);

    void aboneazaPacient(Pacient pacient);

    void dezaboneazaPacient(Pacient pacient);
}
