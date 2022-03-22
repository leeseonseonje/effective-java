package effective.java.effectivejava.item43;

import effective.java.effectivejava.item43.code.MethodRef;
import effective.java.effectivejava.item43.code.MethodReferenceTest;
import org.junit.jupiter.api.Test;

public class Item43Test {

    @Test
    void test() {
        MethodReferenceTest methodReferenceTest = this::methodReference;

        System.out.println(methodReferenceTest.test("L1", "L2"));
    }

    private String methodReference(String x, String y) {
        return x + y;
    }

    @Test
    void test2() {

        MethodRef methodRef = new MethodRef();
        MethodReferenceTest methodReferenceTest = methodRef::test;
        String test = methodReferenceTest.test("s1", "s2");
        System.out.println(test);
    }
}
