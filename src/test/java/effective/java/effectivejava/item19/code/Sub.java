package effective.java.effectivejava.item19.code;

public class Sub extends Super {

    private final String s;

    public Sub(String s) {
        this.s = s;
    }

    @Override
    public void over() {
        overTest();
    }

    private void overTest() {
        s.length();
    }
}
