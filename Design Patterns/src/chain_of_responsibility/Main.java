package chain_of_responsibility;

public class Main {
    public static void main(String[] args) {
        Message msg = new Message("我A很B爱C你");

        FilterChain fc1 = new FilterChain();
        fc1.add(new BFilter());

        FilterChain fc2 = new FilterChain();
        fc2.add(new AFilter()).add(new CFilter());

        fc1.add(fc2);

        fc1.doFilter(msg);

        System.out.println(msg.toString());
    }
}
