package effective.java.effectivejava.item31;

import effective.java.effectivejava.item31.code.BoundedWildCard;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.awt.font.LineMetrics;
import java.util.ArrayList;
import java.util.List;

public class Item31Test {

    @Test
    void test() {
        BoundedWildCard<Number> boundedWildCard = new BoundedWildCard<>();

        List<Number> numbers = new ArrayList<>();
        List<Integer> integers = new ArrayList<>();
        List<Object> objects = new ArrayList<>();

        objects.add("das");
        numbers.add(1);
        integers.add(1);

        List<Number> numberList = boundedWildCard.genericTest(numbers);
        List<? extends Number> extendsTest = boundedWildCard.extendsTest(integers);
        List<? super Number> superTest = boundedWildCard.superTest(objects);

        Assertions.assertThat(numberList.get(0)).isInstanceOf(Number.class);
        Assertions.assertThat(extendsTest.get(0)).isInstanceOf(Integer.class);
        Assertions.assertThat(superTest.get(0)).isInstanceOf(Object.class);

    }
}
