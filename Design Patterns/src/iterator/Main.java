package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        Iterator<Integer> it = l.iterator();
        while(it.hasNext()) {
            int i = it.next();
            System.out.print(i + " ");
        }
    }
}
