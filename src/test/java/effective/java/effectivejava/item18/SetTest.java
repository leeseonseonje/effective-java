package effective.java.effectivejava.item18;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;

@Slf4j
public class SetTest {

    @Test
    void test() {
        InstrumentedSet<String> set = new InstrumentedSet<>(new HashSet<>());

        List<String> list = List.of("A", "B", "C");

        set.addAll(list);
        set.add("D");

        log.info("addCount={}", set.getAddCount());
    }
}
