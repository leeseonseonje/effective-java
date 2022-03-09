package effective.java.effectivejava.item20.inter;

public interface TestDefault {

    Singer singer = null;

    String st = null;

    void print(int x);

    default String defaultTest(String s) {
        return "defaultTest -> " + s;
    }
}
