package ro.ase.cts.clase;

import java.util.ArrayList;
import java.util.List;


public class CasaDeMarcat implements ComandaManager{
    private static CasaDeMarcat instanta = null;

    List<Bautura> bauturiComandate;
    private CasaDeMarcat(){
        this.bauturiComandate=new ArrayList<>();
    }
    @Override
    public void adaugaBautura(Bautura bautura) {
        bauturiComandate.add(bautura);
    }
    public static CasaDeMarcat getInstance(){
        if(instanta==null){
            instanta= new CasaDeMarcat();
        }
        return instanta;
    }
    @Override
    public void afiseazaComanda() {
        if(bauturiComandate.isEmpty()){
            System.out.println("Lista comenzi goala!");
        } else {
            for(Bautura b: bauturiComandate){
                b.afisareDescriere();
            }
        }
    }

    @Override
    public void comandaFinalizata() {
        bauturiComandate.clear();
    }

    @Override
    public int calculeazaPret() {
        int total =0;
        for(Bautura b : bauturiComandate){
            total += b.getPret();
        }
        return total;
    }
}
