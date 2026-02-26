package ro.ase.cts.clase.loader;

import ro.ase.cts.clase.Aplicant;

import java.io.FileNotFoundException;
import java.util.List;

public interface IAplicantiLoader {
    List<Aplicant> load(String file) throws FileNotFoundException;
}
