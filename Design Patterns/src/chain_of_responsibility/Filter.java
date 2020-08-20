package chain_of_responsibility;

public interface Filter {
    boolean doFilter(Message msg);
}
