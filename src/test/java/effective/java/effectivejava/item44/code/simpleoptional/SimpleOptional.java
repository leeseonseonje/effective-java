package effective.java.effectivejava.item44.code.simpleoptional;

import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class SimpleOptional<T> {

    private T t;

    private SimpleOptional() {}

    private SimpleOptional(T t) {
        this.t = Objects.requireNonNull(t);
    }

    public static <T> SimpleOptional<T> of(T t) {
        return new SimpleOptional<>(t);
    }

    public static <T> SimpleOptional<T> ofNullable(T t) {
        if (t == null) {
            return new SimpleOptional<>();
        } else {
            return of(t);
        }
    }

    public T get() {
        return t;
    }

    public T orElseGet(Supplier<? extends T> supplier) {
        if (t == null) {
            return supplier.get();
        } else {
            return t;
        }
    }

    public T orElseThrow(Supplier<? extends RuntimeException> supplier) {
        if (t == null) {
            throw supplier.get();
        } else {
            return t;
        }
    }

    public void ifPresent(Consumer<? super T> consumer) {
        if (t != null) {
            consumer.accept(t);
        }
    }
}
