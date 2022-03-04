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

        Complex complex1 = new Complex(2.5, 1.5);
        Complex plus = complex.plus(complex1);
        log.info("plus={}", plus);

        Complex minus = complex.minus(complex1);
        log.info("minus={}", minus);

        Complex times = complex.times(complex1);
        log.info("times={}", times);

        Complex dividedBy = complex.dividedBy(complex1);
        log.info("dividedBy={}", dividedBy);
    }
}
