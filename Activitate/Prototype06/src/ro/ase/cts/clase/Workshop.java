package ro.ase.cts.clase;

public class Workshop extends Intalnire{
    public Workshop(String title, String data) {
        super(title, data);
    }

    @Override
    public void broadcast() {
        StringBuilder sb = new StringBuilder("Intalnirea de tip Workshop cu titlul: ");
        sb.append(super.getTitle()).append(" si data: ").append(super.getData());
        sb.append(" a inceput");
        System.out.println(sb.toString());
    }
}
