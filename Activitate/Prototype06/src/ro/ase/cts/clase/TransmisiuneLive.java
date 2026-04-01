package ro.ase.cts.clase;

import java.util.ArrayList;
import java.util.List;

public class TransmisiuneLive implements Webinar{
    private String title;
    private String description;
    private List<String> comments;

    public TransmisiuneLive(String title, List<String> comments, String description) {
        this.title = title;
        this.comments = new ArrayList<>(comments);
        this.description = description;
    }

    private TransmisiuneLive() {
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public void setTitle(String title) {
        this.title=title;
    }

    @Override
    public String getDescription() {
       return this.description;
    }

    @Override
    public List<String> getComments() {
        return this.comments;
    }

    @Override
    public void setDescription(String description) {
        this.description=description;
    }

    @Override
    public void addComment(String comment) {
        comments.add(comment);
    }
    public TransmisiuneLive copiaza(){
        TransmisiuneLive transmisiuneLiveNoua = new TransmisiuneLive();
        transmisiuneLiveNoua.description=this.description;
        transmisiuneLiveNoua.title=this.title;
        transmisiuneLiveNoua.comments=new ArrayList<>(this.comments);
        return transmisiuneLiveNoua;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TransmisiuneLive{");
        sb.append("title='").append(title).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append(", comments=").append(comments);
        sb.append('}');
        return sb.toString();
    }
}
