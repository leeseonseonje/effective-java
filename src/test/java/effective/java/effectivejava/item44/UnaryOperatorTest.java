package effective.java.effectivejava.item44;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class UnaryOperatorTest {

    @Test
    void testUnary() {
        java.util.function.UnaryOperator<String> unaryOperator = this::unaryTest;
        String ss = unaryOperator.apply("ss");
        assertThat(ss).isEqualTo("UNARY RETURN ZZ");
    }

    private String unaryTest(String s1) {
        return "UNARY RETURN ZZ";
    }
}
