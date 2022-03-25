package effective.java.effectivejava.item44;

import org.junit.jupiter.api.Test;

import java.util.function.BinaryOperator;

import static org.assertj.core.api.Assertions.assertThat;

public class BinaryOperatorTest {

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
}
