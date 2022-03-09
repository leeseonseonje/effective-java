package effective.java.effectivejava.item20.abclass;

public class TestAbstractClassExtend extends TestAbstractClass {

    private String value;

    public TestAbstractClassExtend(String message, String value) {
        super(message);
        this.value = value;
    }

    @Override
    public void print(int x) {
        System.out.println(x);
    }

    public void println(String s) {
        System.out.println(s);
    }

    @Override
    public void sing() {
        super.sing();
        System.out.println(value);
    }
}
