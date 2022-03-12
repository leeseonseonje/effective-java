package effective.java.effectivejava.item30.code;

public class ComparableImpl implements Comparable<ComparableImpl> {

    private int x;

    public ComparableImpl(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    @Override
    public int compareTo(ComparableImpl comparable) {
        return comparable.getX() - this.x;
    }

    @Override
    public String toString() {
        return "" + x;
    }
}
