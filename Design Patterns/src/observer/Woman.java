package observer;

public class Woman extends Observer {

    private String name;

    public Woman(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(Event event) {
        System.out.println(
                "Woman " + name + " see Monkey " +
                        event.getSource().getName() +
                        " " + event.getAction()
        );
    }
}
