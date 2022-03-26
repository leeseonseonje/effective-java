package effective.java.effectivejava.item44;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerTest {

    @Test
    void test() {
        Consumer<List<String>> consumer = this::printList;

        consumer.accept(List.of("A", "b", "c"));
    }

    private void printList(List<String> list) {
        list.forEach(System.out::print);
    }
}
