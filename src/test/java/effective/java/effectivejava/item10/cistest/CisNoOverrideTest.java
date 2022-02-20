package effective.java.effectivejava.item10.cistest;

import effective.java.effectivejava.item10.code.cis.CaseInsensitiveStringNoOverride;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class CisNoOverrideTest {

    @Test
    void test() {

        CaseInsensitiveStringNoOverride cis1 = new CaseInsensitiveStringNoOverride("V2");
        CaseInsensitiveStringNoOverride cis2 = new CaseInsensitiveStringNoOverride("V2");

        log.info("NoOverride={}", cis1.equals(cis2));
    }
}
