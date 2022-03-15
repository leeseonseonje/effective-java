package effective.java.effectivejava.item34.code;

import lombok.Getter;

import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Getter
public enum TestEnum {

    A("A", "B", "C", "D") {
        public void test() {
            System.out.println("A Instance");
        }
    },
    B("E", "F", "G", "H") {
        public void test() {
            System.out.println("B Instance");
        }
    };


    private final String one;
    private final String two;
    private final String three;
    private final String four;
    private final String all;

    TestEnum(String one, String two, String three, String four) {
        this.one = one;
        this.two = two;
        this.three = three;
        this.four = four;
        this.all = one + two + three + four;
    }

    public abstract void test();

    public void print(TestEnum testEnum) {
        System.out.println(testEnum.one + testEnum.two + testEnum.three + testEnum.four);
    }

    public void print() {
        System.out.println(one + two + three + four);
    }

    private static final Map<String, TestEnum> map =
            Stream.of(values()).collect(Collectors.toMap(e -> e.one, Function.identity()));

    public static TestEnum from(String testEnum) {
        String key = map.keySet().stream().filter(e -> e.contains(testEnum)).findFirst().orElseThrow();

        return map.get(key);
    }
}
