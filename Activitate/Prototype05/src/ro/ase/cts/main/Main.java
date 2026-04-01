package ro.ase.cts.main;

import ro.ase.cts.clase.AutonomousDriving;
import ro.ase.cts.clase.DroneConnection;
import ro.ase.cts.clase.IDroneConnection;
import ro.ase.cts.clase.PrototypeAutonomousDriving;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> decisionRules1 = new ArrayList<>();
        decisionRules1.add("1");
        decisionRules1.add("2");
        decisionRules1.add("3");
        List<String> decisionRules2 = new ArrayList<>();
        decisionRules2.add("3");
        decisionRules2.add("4");
        decisionRules2.add("5");
        List<String> decisionRules3 = new ArrayList<>();
        decisionRules3.add("3");
        decisionRules3.add("4");
        decisionRules3.add("5");

        PrototypeAutonomousDriving claude = new AutonomousDriving("claudio", true, decisionRules1);
        System.out.println(claude);
        PrototypeAutonomousDriving gpt = claude.copiaza();
        ((AutonomousDriving) gpt).setDecisionRules(decisionRules3);
        System.out.println(claude);
        System.out.println(gpt);
        IDroneConnection conexiunea1 = DroneConnection.getInstance();
        conexiunea1.setIp("12.234.120:27015");
        conexiunea1.afisareDescriere();
        IDroneConnection conexiunea2 = DroneConnection.getInstance();
        conexiunea2.setIp("12.234.120:2123123");
        conexiunea1.afisareDescriere();
        conexiunea2.afisareDescriere();
    }
}
