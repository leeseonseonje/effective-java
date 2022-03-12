package effective.java.effectivejava.item26.code;

import java.util.List;

public class UnboundedWildCardType<E> {

    public void test(List<?> list, List<E> listE) {
        for (Object o : list) {
            System.out.println(o);
        }
        for (E e : listE) {
            System.out.println(e);
        }
    }
}
