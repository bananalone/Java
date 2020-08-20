package observer;

public class Event {

    private Monkey source;
    private String action;

    public Event(Monkey source , String action){
        this.source = source;
        this.action = action;
    }

    public Monkey getSource() {
        return source;
    }

    public String getAction() {
        return action;
    }
}
