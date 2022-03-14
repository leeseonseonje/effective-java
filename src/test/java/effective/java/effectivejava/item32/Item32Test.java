package effective.java.effectivejava.item32;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class Item32Test {

    @Test
    void test() {
        List<String> stringLists = List.of("A", "B", "C", "D");
        List<Integer> intList = List.of(42);
        Object[] objects = stringLists.toArray();
        objects[0] = intList;
        String s = stringLists.get(0);

        System.out.println(s);
    }
}
