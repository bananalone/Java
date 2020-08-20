package TestTCP;

import java.io.Serializable;

public class Information implements Serializable {

    private String sender;
    private String content;

    public Information(String sender, String content) {
        this.sender = sender;
        this.content = content;
    }

    @Override
    public String toString() {
        return "Information{" +
                "sender='" + sender + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
