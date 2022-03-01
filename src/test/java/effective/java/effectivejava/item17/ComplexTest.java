package effective.java.effectivejava.item17;

import effective.java.effectivejava.item17.code.Complex;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class ComplexTest {

    @Test
    void test() {
        Complex complex = new Complex(1.5, 1.5);

        double re = complex.realPart();
        log.info("re={}", re);

        double im = complex.imaginaryPart();
        log.info("im={}", im);
    }
}
