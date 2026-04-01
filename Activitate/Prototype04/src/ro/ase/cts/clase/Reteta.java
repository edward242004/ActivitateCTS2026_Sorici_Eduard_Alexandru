package ro.ase.cts.clase;

import java.util.ArrayList;
import java.util.List;

public class Reteta implements PrototypeReteta {
    private List<String> ingrediente;
    private List<Integer> cantitate;

    public Reteta(List<String> ingrediente, List<Integer> cantitate) {
        if (ingrediente.size() > 0 && !ingrediente.isEmpty()) {
            this.ingrediente = ingrediente;
        }
        if (cantitate.size() > 0 && !ingrediente.isEmpty()) {
            this.cantitate = cantitate;
        }
    }

    public void setIngrediente(List<String> ingrediente) {
        this.ingrediente = ingrediente;
    }

    public void setCantitate(List<Integer> cantitate) {
        this.cantitate = cantitate;
    }

    private Reteta() {
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(" ingrediente ").append(ingrediente);
        sb.append(", cantitate ").append(cantitate);
        return sb.toString();
    }

    @Override
    public PrototypeReteta copiaza() {
        Reteta reteta = new Reteta();
        reteta.ingrediente=new ArrayList<>(this.ingrediente);
        reteta.cantitate=new ArrayList<>(this.cantitate);
        return reteta;
    }
}
