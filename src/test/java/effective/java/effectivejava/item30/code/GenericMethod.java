package effective.java.effectivejava.item30.code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GenericMethod {

    public <E extends Number> List<E> genericTest(List<E> list) {
        return list;
    }

    public List<?> wildCardTest(List<?> list) {
        return list;
    }

    public <E extends Comparable<E>> void recursionBounded(List<E> list) {
        Collections.sort(list);
    }
}
