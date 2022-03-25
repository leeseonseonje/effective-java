package effective.java.effectivejava.item44;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.function.Function;

import static org.assertj.core.api.Assertions.*;

public class FunctionTest {

    @Test
    void test() {
        Function<String, Integer> function = this::casting;

        assertThat(function.apply("5")).isEqualTo(5);
    }

    private Integer casting(String s) {
        return Integer.parseInt(s);
    }

    @Test
    void test2() {
        Function<String, List<String>> function = this::addString;

        assertThat(function.apply("s").get(0)).isEqualTo("s");
    }

    private List<String> addString(String s) {
        return List.of(s);
    }
}
