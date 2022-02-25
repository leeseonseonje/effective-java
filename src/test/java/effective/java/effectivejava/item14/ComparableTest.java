package effective.java.effectivejava.item14;

import effective.java.effectivejava.item14.comparable.PhoneNumber;
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
        s.forEach(System.out::println);
    }

    @Test
    void test() {
        PhoneNumber phoneNumber = new PhoneNumber(010, 1234, 5678);
        PhoneNumber phoneNumber2 = new PhoneNumber(011, 0000, 0000);

        log.info("phoneNumber.compareTo(phoneNumber2)={}", phoneNumber.compareTo(phoneNumber2));
    }
}
