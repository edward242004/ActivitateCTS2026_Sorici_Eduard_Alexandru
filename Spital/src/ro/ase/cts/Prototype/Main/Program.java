package ro.ase.cts.Prototype.Main;

import ro.ase.cts.Prototype.Clase.Internare;
import ro.ase.cts.Prototype.Clase.InternareBuilder;
import ro.ase.cts.Prototype.Clase.InternareBuilderAlternativ;

public class Program {
    public static void main(String[] args) {
        Internare internare = new Internare(true,true,true,true,"Mihai Popescu");
        Internare internare2 = new Internare(false,false,false,false,"Ana-Maria");

        InternareBuilder builder = new InternareBuilder("Ana-Maria");
        Internare internare3 = builder.build();
        Internare internare4 = builder.setnume("Andrei Mateescu").setPat(true).setMic(true).setHalat(true).setPapuci(true).build();
        System.out.println(internare3);
        System.out.println(internare4);

        InternareBuilderAlternativ builderAlternativ = new InternareBuilderAlternativ();
        builderAlternativ.setMic(true);
        Internare internare100 = builderAlternativ.build("Paul Mocanu");
        Internare internare101 = builderAlternativ.setPapuci(true).build("Leonard Diaconu");
        System.out.println(internare100);
        System.out.println(internare101);



    }
}
