package strategy;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        int[] a = {, 2, 6, 7, 5, 9, 1};
        Cat[] a = {new Cat(4), new Cat(3), new Cat(7)};
        Sorter sorter = new Sorter();
        sorter.sort(a, new Comparator<Cat>() {
            @Override
            public int compare(Cat o1, Cat o2) {
                if(o1.getWeight() < o2.getWeight()) { return -1; }
                else if(o1.getWeight() > o2.getWeight()) {return 1;}
                else {return 0;}
            }
        });
        System.out.println(Arrays.toString(a));
    }
}
