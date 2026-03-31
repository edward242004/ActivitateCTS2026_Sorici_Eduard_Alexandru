package ro.ase.cts.main;

import ro.ase.cts.clase.Alerta;
import ro.ase.cts.factory.AlertaFactory;
import ro.ase.cts.factory.AlertaType;

public class Main {
    public static void afisareAlerta(Alerta alerta){
        alerta.afisareDescriere();
    }
    public static void main(String[] args) throws Exception{
        AlertaFactory factory1 = AlertaFactory.getInstance();
        Alerta codGalben = factory1.getAlerta("Grigore Alexandrescu","ATI", AlertaType.COD_GALBEN);
        Alerta codVerde = factory1.getAlerta("Grigore Alexandrescu","ATI",AlertaType.COD_VERDE);
        Alerta codRosu = factory1.getAlerta("Militar","ATI",AlertaType.COD_ROSU);
        afisareAlerta(codRosu);
        afisareAlerta(codGalben);
        afisareAlerta(codVerde);
    }
}
