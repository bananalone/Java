package chain_of_responsibility;

public class BFilter implements Filter {
    @Override
    public boolean doFilter(Message msg) {
        String str = msg.getStr();
        str = str.replace("B", "");
        msg.setStr(str);
        return true;
    }
}
