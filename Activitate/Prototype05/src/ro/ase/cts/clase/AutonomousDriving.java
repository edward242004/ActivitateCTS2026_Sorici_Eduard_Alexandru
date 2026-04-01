package ro.ase.cts.clase;

import java.util.ArrayList;
import java.util.List;

public class AutonomousDriving implements PrototypeAutonomousDriving {
    private String versiuneAi;
    private boolean premium;
    private List<String> decisionRules;


    public AutonomousDriving(String versiuneAi, boolean premium, List<String> decisionRules) {
        this.versiuneAi = versiuneAi;
        this.premium = premium;
        this.decisionRules = new ArrayList<>(decisionRules);
    }

    private AutonomousDriving() {
    }

    public void setVersiuneAi(String versiuneAi) {
        this.versiuneAi = versiuneAi;
    }

    public void setPremium(boolean premium) {
        this.premium = premium;
    }

    public void setDecisionRules(List<String> decisionRules) {
        this.decisionRules = new ArrayList<>(decisionRules);
    }

    @Override
    public PrototypeAutonomousDriving copiaza() {
        AutonomousDriving newAI = new AutonomousDriving();
        newAI.premium = this.premium;
        newAI.versiuneAi = this.versiuneAi;
        newAI.decisionRules = new ArrayList<>(this.decisionRules);
        return newAI;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("versiuneAi='").append(versiuneAi).append('\'');
        sb.append(", premium=").append(premium);
        sb.append(", decision rules= ").append(decisionRules);
        sb.append('}');
        return sb.toString();
    }
}
