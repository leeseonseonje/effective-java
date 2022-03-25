package effective.java.effectivejava.item44;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.function.Predicate;

import static org.assertj.core.api.Assertions.*;

public class PredicateTest {

    @Test
    void test() {
        Predicate<String> predicate = this::equalsTest;

        assertThat(predicate.test("TEST")).isTrue();
    }

    private boolean equalsTest(String s) {
        return "TEST".equals(s);
    }
}
