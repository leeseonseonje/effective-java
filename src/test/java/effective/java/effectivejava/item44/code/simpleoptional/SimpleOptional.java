package effective.java.effectivejava.item44.code.simpleoptional;

import java.util.function.Supplier;

public class SimpleOptional<T> {

    private T t;

    private SimpleOptional(T t) {
        this.t = t;
    }

    public static <T> SimpleOptional<T> of(T t) {
        return new SimpleOptional<T>(t);
    }

    public T orElseGet(Supplier<? extends T> supplier) {
        if (t == null) {
            return supplier.get();
        } else {
            return t;
        }
    }
}
