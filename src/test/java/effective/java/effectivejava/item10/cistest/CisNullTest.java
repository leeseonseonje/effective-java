package effective.java.effectivejava.item10.cistest;

import effective.java.effectivejava.item10.code.cis.CaseInsensitiveStringNull;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class CisNullTest {

    @Test
    void test() {

        CaseInsensitiveStringNull cis = new CaseInsensitiveStringNull("null");
        log.info("null={}", cis.equals(null));
    }
}
