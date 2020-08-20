package observer;

public class Man extends Observer {

    private String name;

    public Man(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(Event event) {
        System.out.println(
                "Man " + name + " see Monkey " +
                event.getSource().getName() +
                " " + event.getAction()
        );
    }

}
