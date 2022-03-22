package effective.java.effectivejava.item43;

import effective.java.effectivejava.item43.code.MethodReferenceTest;
import org.junit.jupiter.api.Test;

public class Item43Test {

    @Test
    void test() {
        MethodReferenceTest methodReferenceTest = Integer::sum;

        System.out.println(methodReferenceTest.test(5, 5));
    }
}
