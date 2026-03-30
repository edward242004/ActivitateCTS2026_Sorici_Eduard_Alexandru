package ro.ase.cts.clase;

public class Contract implements PrototypeContract {
    private String tipAbonament;
    private String listaClauzeStandard;
    private double pret;
    private String numeClient;

    private Contract() {
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public void setNumeClient(String numeClient) {
        this.numeClient = numeClient;
    }

    public Contract(String tipAbonament, double pret, String listaClauzeStandard) {
        if (tipAbonament.length() >= 2) {
            this.tipAbonament = tipAbonament;
        }
        if (pret > 0) {
            this.pret = pret;
        }
        if (listaClauzeStandard.length() >= 0) {
            this.listaClauzeStandard = listaClauzeStandard;
        }
    }

    @Override
    public PrototypeContract copiaza() {
        Contract contractNou = new Contract();
        contractNou.listaClauzeStandard=this.listaClauzeStandard;
        contractNou.pret=this.pret;
        contractNou.numeClient=this.numeClient;
        contractNou.tipAbonament=this.tipAbonament;
        return contractNou;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Contract ");
        sb.append("tipAbonament  ").append(tipAbonament);
        sb.append(", listaClauzeStandard ").append(listaClauzeStandard);
        sb.append(", pret ").append(pret);
        sb.append(", numeClient '").append(numeClient);
        return sb.toString();
    }
}
