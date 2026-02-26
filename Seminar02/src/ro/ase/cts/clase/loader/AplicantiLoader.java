package ro.ase.cts.clase.loader;

import ro.ase.cts.clase.Aplicant;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public abstract class AplicantiLoader {
    public abstract List<Aplicant> load(String file) throws FileNotFoundException;
        public void loadAplicantiData(Scanner input,Aplicant aplicant){
            String nume = input.next();
            String prenume = input.next();
            int varsta = input.nextInt();
            int punctaj = input.nextInt();
            int nr = input.nextInt();
            String[] vect = new String[5];
            for (int i = 0; i < nr; i++)
                vect[i] = input.next();
            aplicant.setNume(nume);
            aplicant.setPrenume(prenume);
            aplicant.setPunctaj(punctaj);
            aplicant.setVarsta(varsta);
            aplicant.setNr_proiecte(nr,vect);
        }

}
