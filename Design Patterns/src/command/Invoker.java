package command;

import java.util.ArrayList;
import java.util.List;

public class Invoker {

    private List<Command> commands = new ArrayList<>();

    public Invoker(){}

    public Invoker addCommand(Command command) {
        commands.add(command);
        return this;
    }

    public void call() {
        for (Command command : commands) {
            command.doit();
        }
    }

    public void back() {
        for(int i = commands.size() - 1; i >= 0; i--) {
            commands.get(i).undo();
        }
    }
}
