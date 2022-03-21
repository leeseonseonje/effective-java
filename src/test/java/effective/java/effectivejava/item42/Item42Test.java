package effective.java.effectivejava.item42;

import effective.java.effectivejava.item20.abclass.A;
import effective.java.effectivejava.item42.code.ABTTT;
import effective.java.effectivejava.item42.code.Operation;
import effective.java.effectivejava.item42.code.OperationImpl;
import effective.java.effectivejava.item42.code.TTT;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static effective.java.effectivejava.item42.code.OperationImpl.*;

public class Item42Test {

    @Test
    void test() {

        List<String> words = new ArrayList<>();
        words.add("123456");
        words.add("1234");
        Collections.sort(words,
                (s1, s2) -> Integer.compare(s1.length(), s1.length()));

        Collections.sort(words,
                Comparator.comparingInt(String::length));

        words.sort(Comparator.comparingInt(String::hashCode));

        for (String word : words) {
            System.out.println(word);
        }
    }

    @Test
    void test2() {
        System.out.println(PLUS.apply(0.5, 0.5));
        System.out.println(PLUS.getOperation());

        System.out.println(MINUS.apply(0.5, 0.5));
        System.out.println(MINUS.getOperation());
    }

    @Test
    void test3() {

        List<String> list = testMethod((a, b, c) -> System.out.println(a + ", " + b + ", " + c));

        TTT ttt = (l1, l2, l3) -> System.out.println(l1 + " > " + l2 + " > " + l3);
        ttt.test(list.get(0), list.get(1), list.get(2));
    }


    List<String> testMethod(TTT ttt) {

        ttt.test("A", "B", "C");
        return List.of("L1", "L2", "L3");
    }

    @Test
    void test4() {

        testAbstractLambda(new ABTTT() {
            @Override
            public void test(Integer x, Integer y) {
                System.out.println(x + ", " + y);
            }
        });

        ABTTT abttt = new ABTTT() {
            @Override
            public void test(Integer x, Integer y) {
                System.out.println(x + y);
            }
        };

        abttt.test(5, 5);
    }

    void testAbstractLambda(ABTTT abttt) {

        abttt.test(2, 5);
        System.out.println("ABTTT");
    }
}
