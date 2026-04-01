package ro.ase.cts.clase;

public abstract class Intalnire implements Event {

    private String data;
    private String title;

    public Intalnire(String data, String title) {
        this.data = data;
        this.title = title;

    }

    @Override
    public void setTitle(String title) {
        this.title=title;
    }

    public String getData() {
        return data;
    }

    @Override
    public String getTitle() {
        return this.title;
    }

}
