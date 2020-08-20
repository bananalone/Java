package chain_of_responsibility;

public class Message {
    private String str;

    public Message(String str){
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "Message{" +
                "str='" + str + '\'' +
                '}';
    }
}
