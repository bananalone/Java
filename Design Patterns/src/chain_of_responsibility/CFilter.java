package chain_of_responsibility;

public class CFilter implements Filter {
    @Override
    public boolean doFilter(Message msg) {
        String str = msg.getStr();
        str = str.replace("C", "");
        msg.setStr(str);
        return true;
    }
}
