package effective.java.effectivejava.item30;

import effective.java.effectivejava.item30.code.NoComparable;
import effective.java.effectivejava.item30.code.GenericMethod;
import effective.java.effectivejava.item30.code.ComparableImpl;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class Item30Test {

    @Test
    void test1() {
        GenericMethod genericMethod = new GenericMethod();
        List<Integer> integers = new ArrayList<>();
        List<String> strings = new ArrayList<>();

        genericMethod.genericTest(integers);
        genericMethod.wildCardTest(integers);
        genericMethod.wildCardTest(strings);
    }

    @Test
    void 재귀적타입한정() {
        List<NoComparable> noComparableList = new ArrayList<>();
        List<ComparableImpl> comparableList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            comparableList.add(new ComparableImpl(i));
        }

        GenericMethod genericMethod = new GenericMethod();

//        genericMethod.recursionBounded(noComparableList); 에러 comparable 구현 하지 않아서
        genericMethod.recursionBounded(comparableList);

        for (ComparableImpl comparable : comparableList) {
            System.out.println(comparable);
        }
    }
}
