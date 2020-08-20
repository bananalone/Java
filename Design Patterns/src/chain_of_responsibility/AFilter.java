package chain_of_responsibility;

public class AFilter implements Filter {
    @Override
    public boolean doFilter(Message msg) {
        String str = msg.getStr();
        str = str.replace("A", "");
        msg.setStr(str);
        return true;
    }
}
