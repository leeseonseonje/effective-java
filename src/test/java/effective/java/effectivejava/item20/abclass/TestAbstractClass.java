package effective.java.effectivejava.item20.abclass;

import effective.java.effectivejava.item20.inter.Singer;

public abstract class TestAbstractClass implements Singer {

    private String message;

    public TestAbstractClass(String message) {
        this.message = message;
    }

    public abstract void print(int x);

    public String testMethod(String s) {
        return "abstractClass -> " + s;
    }

    @Override
    public void sing() {
        singMethod();
    }

    private void singMethod() {
        System.out.println(message);
    }
}
