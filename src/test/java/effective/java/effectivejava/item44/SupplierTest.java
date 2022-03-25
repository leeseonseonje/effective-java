package effective.java.effectivejava.item44;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.function.Supplier;

public class SupplierTest {

    @Test
    void test() {
        Supplier<List<String>> supplier = this::printList;

        List<String> list = supplier.get();

        list.forEach(System.out::println);
    }

    private List<String> printList() {
        return List.of("s1", "s2", "s3", "s4", "s5");
    }
}
