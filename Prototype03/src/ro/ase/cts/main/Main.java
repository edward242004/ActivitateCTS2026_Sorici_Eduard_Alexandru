package ro.ase.cts.main;

import ro.ase.cts.clase.PrototypeReteta;
import ro.ase.cts.clase.Reteta;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> ingrediente=new ArrayList<>();
        ingrediente.add("cacao");
        ingrediente.add("lapte");
        ingrediente.add("seminte");
        List<Integer> cantitati = new ArrayList<>();
        cantitati.add(100);
        cantitati.add(400);
        cantitati.add(300);
        PrototypeReteta reteta1= new Reteta(ingrediente,cantitati);
        PrototypeReteta reteta2= reteta1.copiaza();
        System.out.println(reteta1);
        System.out.println(reteta2);
        System.out.println("===============");
        List<Integer> cantitati2 =new ArrayList<>();
        cantitati2.add(200);
        cantitati2.add(300);
        cantitati2.add(500);
        List<String> ingrediente2 = new ArrayList<>();
        ingrediente2.add("macao");
        ingrediente2.add("fanta");
        ingrediente2.add("suc");
        ((Reteta)reteta2).setIngrediente(ingrediente2);
        ((Reteta)reteta2).setCantitate(cantitati2);
        System.out.println(reteta1);
        System.out.println(reteta2);


    }
}
