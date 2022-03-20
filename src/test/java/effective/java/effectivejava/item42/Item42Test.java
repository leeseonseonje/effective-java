package effective.java.effectivejava.item42;

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
        testMethod(() -> System.out.println("interface"));
    }


    void testMethod(TTT ttt) {
        ttt.test();
        System.out.println("TTT");
    }

    @Test
    void test4() {
        testAbstractLambda(new ABTTT() {
            @Override
            public void test() {
                System.out.println("Abstract");
            }
        });
    }

    void testAbstractLambda(ABTTT abttt) {
        abttt.test();
        System.out.println("ABTTT");
    }
}
