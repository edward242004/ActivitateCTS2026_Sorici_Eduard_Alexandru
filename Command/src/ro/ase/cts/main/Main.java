package ro.ase.cts.main;

import ro.ase.cts.clase.*;

public class Main {
    public static void main(String[] args) {
        PersonalSpital medic = new Medic("Popescu");
        PersonalSpital asistenta = new Asistenta("Ioaneta");

        Pacient pacient1 = new Pacient("George");
        Pacient pacient2 = new Pacient("Gelu");

        Command comanda1 = new Internare(medic, pacient1);
        Command comanda2 = new Tratare(asistenta, pacient2);

        Operator operator = new Operator();
        operator.inregistreaza(comanda1);
        operator.inregistreaza(comanda2);
        operator.executaFisa();

        operator.inregistreaza(new Tratare(medic, new Pacient("Gogu")));
        operator.executaFisa();
        operator.executaFisa();
    }
}
