package ro.ase.cts.clase;

public class Conferinta extends Intalnire{
    public Conferinta(String title, String data) {
        super(title, data);
    }

    @Override
    public void broadcast() {
        StringBuilder sb = new StringBuilder("Intalnirea de tip Conferinta cu titlul: ");
        sb.append(super.getTitle()).append(" si data: ").append(super.getData());
        sb.append(" a inceput");
        System.out.println(sb.toString());
    }


}
