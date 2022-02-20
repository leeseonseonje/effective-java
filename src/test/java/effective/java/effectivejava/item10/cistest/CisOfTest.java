package effective.java.effectivejava.item10.cistest;

import effective.java.effectivejava.item10.code.cis.CaseInsensitiveStringOf;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class CisOfTest {

    @Test
    void test() {

        CaseInsensitiveStringOf cis1 = CaseInsensitiveStringOf.of("SingleTon");
        CaseInsensitiveStringOf cis2 = CaseInsensitiveStringOf.of("SingleTon");

        log.info("singleTonEquals={}", cis1.equals(cis2));
    }
}
