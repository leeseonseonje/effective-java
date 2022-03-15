package effective.java.effectivejava.item32;

import effective.java.effectivejava.item32.code.PickTwo;
import effective.java.effectivejava.item32.code.VarargsTest;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class Item32Test {

    @Test
    void test() {
        VarargsTest varargs = new VarargsTest();

        List<String> list = new ArrayList<>(List.of("A", "B", "C", "D"));
        List<String> d = new ArrayList<>(List.of("A", "B", "C", "D"));

        assertThatThrownBy(() -> varargs.test(list, d)).isInstanceOf(ClassCastException.class);
    }

    @Test
    void test2() {

        PickTwo pickTwo = new PickTwo();

        List<String> result = pickTwo.pickTwo("A", "B", "C");

        assertThat(result.size()).isEqualTo(3);
    }
}
