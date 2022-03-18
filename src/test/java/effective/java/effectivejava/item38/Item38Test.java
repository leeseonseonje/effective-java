package effective.java.effectivejava.item38;

import effective.java.effectivejava.item38.code.BasicOperation;
import effective.java.effectivejava.item38.code.ExtendedOperation;
import effective.java.effectivejava.item38.code.Operation;
import lombok.Getter;
import org.junit.jupiter.api.Test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;

public class Item38Test {

    @Test
    void enumExtendedTest() {

        double x = 0.5;
        double y = 0.5;

        List<Double> list = new ArrayList<>();

        list.add(BasicOperation.PLUS.apply(x, y));
        list.add(BasicOperation.MINUS.apply(x, y));
        list.add(BasicOperation.TIMES.apply(x, y));
        list.add(BasicOperation.DIVIDE.apply(x, y));
        list.add(ExtendedOperation.EXP.apply(x, y));
        list.add(ExtendedOperation.REMAINDER.apply(x, y));
        list.forEach(System.out::println);
    }
}
