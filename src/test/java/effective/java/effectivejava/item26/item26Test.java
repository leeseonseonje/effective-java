package effective.java.effectivejava.item26;

import effective.java.effectivejava.item26.code.BoundedWildCardType;
import effective.java.effectivejava.item28.code.GenericArray;
import effective.java.effectivejava.item26.code.GenericChar;
import effective.java.effectivejava.item26.code.UnboundedWildCardType;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class item26Test {

    @Test
    void test() {
        List<Object> objects = new ArrayList<>();
        List<String> strings = new ArrayList<>();

        objects.add("dd");
        objects.add("dsad");
        strings.add("dasda");
        strings.add("dasda");

        for (Object object : objects) {
            System.out.println(object.toString());
        }
        for (String string : strings) {
            System.out.println("string = " + string);
        }
    }

    @Test
    void test2() {
        UnboundedWildCardType<String> wildCardType = new UnboundedWildCardType<>();
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        wildCardType.test(integers, list);
    }

    @Test
    void test3() {
        BoundedWildCardType wct = new BoundedWildCardType();
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        wct.test(integers);
    }

    @Test
    void test4() {
        GenericChar<String> genericChar = new GenericChar<>();
        List<String> list = new ArrayList<>();
        list.add("HELLO");
        genericChar.test(list);
    }

    @Test
    void test5() {
        Object[] array = new Long[10];
        Assertions.assertThatThrownBy(() -> array[0] = "STRING").isInstanceOf(ArrayStoreException.class);
    }
}

