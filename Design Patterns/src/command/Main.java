package command;

public class Main {
    public static void main(String[] args) {

        StringBuilder receiver = new StringBuilder("I love you");
        System.out.println(receiver);

        Invoker ivk = new Invoker();
        ivk.addCommand(new InsertCmd(receiver, " very"))
                .addCommand(new InsertCmd(receiver, " much"));

        ivk.call();
        System.out.println(receiver);
        ivk.back();
        System.out.println(receiver);

    }
}
