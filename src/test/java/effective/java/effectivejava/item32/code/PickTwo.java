package effective.java.effectivejava.item32.code;

import java.util.List;

public class PickTwo {

    public <T> List<T> pickTwo(T a, T b, T c) {
        return List.of(a, b, c);
    }
}
