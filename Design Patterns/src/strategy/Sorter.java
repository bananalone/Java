package strategy;

import java.util.Arrays;

public class Sorter<T> {

    public void sort(T[] a, Comparator<T> comparator) {
        for(int i = 0; i < a.length; i++) {
            int argmin = i;
            for(int j = i + 1; j < a.length; j++) {
                if(comparator.compare(a[j], a[argmin]) == -1) {
                    argmin = j;
                }
            }
            swap(a, i, argmin);
        }
    }

    private void swap(T[] a, int i, int j) {
        T t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
