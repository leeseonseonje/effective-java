package effective.java.effectivejava.item26.code;

import java.util.List;

public class GenericChar<ASDF> {

    public void test(List<ASDF> list) {
        for (ASDF a : list) {
            System.out.println(a);
        }
    }
}
