package effective.java.effectivejava.item20.inter;

public class TestDefaultImpl implements TestDefault {

    @Override
    public void print(int x) {
        System.out.println(x);
    }

    public void println(String s) {
        System.out.println(s);
    }

    @Override
    public String defaultTest(String s) {
        return "override";
    }
}
