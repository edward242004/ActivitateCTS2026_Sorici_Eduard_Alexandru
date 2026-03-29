package ro.ase.cts.factory;

import ro.ase.cts.clase.Alerta;
import ro.ase.cts.clase.CodGalben;
import ro.ase.cts.clase.CodRosu;
import ro.ase.cts.clase.CodVerde;

public class AlertaFactory {
    private static AlertaFactory instanta = null;

    public static synchronized AlertaFactory getInstance() {
        if (instanta == null) {
            instanta = new AlertaFactory();
        }
        return instanta;
    }
    private AlertaFactory(){}
    public Alerta getAlerta(String numeSpital,String numeSectie,AlertaType tip) throws Exception{
        if(tip==AlertaType.COD_VERDE)
            return new CodVerde(numeSectie,numeSpital);
        if(tip==AlertaType.COD_GALBEN)
            return new CodGalben(numeSectie,numeSpital);
        if(tip==AlertaType.COD_ROSU)
            return new CodRosu(numeSectie,numeSpital);
        throw new Exception("Tip invalid!");
    }
}
