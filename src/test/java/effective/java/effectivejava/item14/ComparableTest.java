package effective.java.effectivejava.item14;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

@Slf4j
public class ComparableTest {

    @Test
    void stringSortTest() {

        Set<String> s = new TreeSet<>();
        s.add("B");
        s.add("A");
        s.add("E");
        s.add("C");
      //  Collections.addAll(s);
        s.forEach(System.out::println);
    }
}
