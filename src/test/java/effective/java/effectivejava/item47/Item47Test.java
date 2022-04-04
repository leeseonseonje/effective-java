package effective.java.effectivejava.item47;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class Item47Test {

    @Test
    void test() {
        List<String> list = List.of("1", "2", "3");

        Map<String, List<String>> collect = list.stream().filter(e -> e.equals("A") || e.equals("B"))
                .collect(groupingBy(e -> e));

        collect.keySet().forEach(m -> System.out.println(m + ": " + collect.get(m)));
    }
}
