package chain_of_responsibility;

import java.util.ArrayList;
import java.util.List;

public class FilterChain implements Filter {

    private List<Filter> chain = new ArrayList<>();

    public FilterChain add(Filter filter) {
        chain.add(filter);
        return this;
    }

    @Override
    public boolean doFilter(Message msg) {
        for(Filter filter : chain){
            if(!filter.doFilter(msg)) {
                return false;
            }
        }
        return true;
    }
}
