package ro.ase.cts.clase;

public class WebinarOnline extends Intalnire{
    public WebinarOnline(String title, String data) {
        super(title, data);
    }
    @Override
    public void broadcast() {
        StringBuilder sb = new StringBuilder("Intalnirea de tip Webinar cu titlul: ");
        sb.append(super.getTitle()).append(" si data: ").append(super.getData());
        sb.append(" a inceput");
        System.out.println(sb.toString());
    }
}
