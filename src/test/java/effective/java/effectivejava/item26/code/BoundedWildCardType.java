package effective.java.effectivejava.item26.code;

import java.util.List;

public class BoundedWildCardType {

    public void test(List<? extends Number> list) {
        for (Number integer : list) {
            System.out.println(integer);
        }
    }
}
