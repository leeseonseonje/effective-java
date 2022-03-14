package effective.java.effectivejava.item32;

import effective.java.effectivejava.item32.code.VarargsTest;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class Item32Test {

    @Test
    void test() {
        VarargsTest varargs = new VarargsTest();

        List<String> list = new ArrayList<>(List.of("A", "B", "C", "D"));

        Assertions.assertThatThrownBy(() -> varargs.test(list)).isInstanceOf(ClassCastException.class);
    }
}
