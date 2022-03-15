package effective.java.effectivejava.item34;

import effective.java.effectivejava.item34.code.TestEnum;
import org.junit.jupiter.api.Test;

public class Item34Test {

    @Test
    void test() {
        for (TestEnum value : TestEnum.values()) {
            System.out.println(value);
        }

        TestEnum a = TestEnum.valueOf("A");
        System.out.println(a);

        String three = TestEnum.B.getThree();
        System.out.println(three);

        TestEnum.A.print(TestEnum.A);
        TestEnum.B.print();

        System.out.println(TestEnum.A.getAll());
        System.out.println(TestEnum.B.getAll());

        TestEnum.A.test();
        TestEnum.B.test();

        System.out.println("=================================================");
        TestEnum testEnum = TestEnum.from("E");
        System.out.println(testEnum);
    }
}
