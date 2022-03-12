package effective.java.effectivejava.item29;

import effective.java.effectivejava.item28.code.GenericArray;
import effective.java.effectivejava.item28.code.GenericList;
import effective.java.effectivejava.item29.code.BWCT;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class Item29Test {

    @Test
    void test1() {
        BWCT<Integer> bwct = new BWCT<>();

        List<Integer> listA = new ArrayList<>();
        List<String> listB = new ArrayList<>();

        bwct.test(listA, listB);
    }
}
