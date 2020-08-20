package strategy;

public class Cat implements Comparable<Cat> {

    private int weight;

    public Cat(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public int compareTo(Cat other) {
        if(this.weight < other.weight) {
            return -1;
        } else if(this.weight == other.weight) {
            return 0;
        } else {
            return 1;
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "weight=" + weight +
                '}';
    }
}
