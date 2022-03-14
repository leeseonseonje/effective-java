package effective.java.effectivejava.item32.code;

import java.util.List;

public class VarargsTest {

    public void test(List<String>... stringLists) {
        List<Integer> intList = List.of(42);
        Object[] objects = stringLists;
        objects[0] = intList;
        System.out.println(stringLists[0].get(0));
    }
}
