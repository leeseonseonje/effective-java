package effective.java.effectivejava.item44;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.UnaryOperator;

import static org.assertj.core.api.Assertions.*;

public class Item44Test {

    @Test
    void test() {
        BinaryOperator<Integer> intBinaryOperator = Integer::sum;
        int i = intBinaryOperator.apply(5, 5);
        assertThat(i).isEqualTo(10);
    }

    @Test
    void test2() {
        BinaryOperator<Integer> intBinaryOperator = this::multiple;

        int i = intBinaryOperator.apply(5, 5);
        assertThat(i).isEqualTo(25);
    }

    private int multiple(int x, int y) {
        return x * y;
    }

    @Test
    void test3() {
        BinaryOperator<String> binaryOperator = this::print;
        String s = binaryOperator.apply("s1", "s2");
        assertThat(s).isEqualTo("s1s2");
    }

    private String print(String s1, String s2) {
        return s1 + s2;
    }

    @Test
    void testUnary() {
        UnaryOperator<String> unaryOperator = this::unaryTest;
        String ss = unaryOperator.apply("ss");
        assertThat(ss).isEqualTo("UNARY RETURN ZZ");
    }

    private String unaryTest(String s1) {
        return "UNARY RETURN ZZ";
    }
}
