package ro.ase.cts.clase.loader;

import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Elev;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EleviLoader extends AplicantiLoader {
    public  List<Aplicant> load (String file) throws FileNotFoundException {
        Scanner input2 = new Scanner(new File(file));
        input2.useDelimiter(",|\n");
        List<Aplicant> elevi = new ArrayList<Aplicant>();

        while (input2.hasNext()) {
            Elev elev = new Elev();
            super.loadAplicantiData(input2,elev);
            int clasa = input2.nextInt();
            String tutore = input2.next();
            elev.setClasa(clasa);
            elev.setNume(elev.getNume());
            elev.setPrenume(elev.getPrenume());
            elev.setTutore(tutore);
            elev.setPunctaj(elev.getPunctaj());
            elev.setVarsta(elev.getVarsta());
            elevi.add(elev);
        }

        input2.close();
        return elevi;
    }
}
