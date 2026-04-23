package ro.ase.cts.clase;

import java.util.ArrayList;

public class Salon {
    private boolean[] paturiLibere = new boolean[10];

    public Salon() {
        this.paturiLibere[0] = false;
        this.paturiLibere[1] = true;
        this.paturiLibere[2] = true;
        this.paturiLibere[3] = false;
        this.paturiLibere[4] = true;
        this.paturiLibere[5] = false;
        this.paturiLibere[6] = true;
        this.paturiLibere[7] = true;
        this.paturiLibere[8] = false;
        this.paturiLibere[9] = false;
    }

    public int getPatLiber() {
        for (int i = 0; i < paturiLibere.length; i++) {
            if (paturiLibere[i] == true) {
                return i;
            }
        }
        return -1;
    }
    public void ocupaPat(int pozitie){
        this.paturiLibere[pozitie]=false;
    }
}
