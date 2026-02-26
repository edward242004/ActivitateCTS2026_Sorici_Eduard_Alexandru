package ro.ase.cts.main;

import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.loader.AngajatiLoader;
import ro.ase.cts.clase.loader.AplicantiLoader;
import ro.ase.cts.clase.loader.IAplicantiLoader;

public class Program {

	public static void main(String[] args) {
		List<Aplicant> listaAngajati;
		AplicantiLoader loader = new AngajatiLoader();
		try {
			listaAngajati = loader.load("angajati.txt");
			for(Aplicant aplicant:listaAngajati)
				System.out.println(aplicant.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
