package effective.java.effectivejava.item10.cistest;

import effective.java.effectivejava.item10.code.cis.CaseInsensitiveStringV1;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class CisTestV1 {

    @Test
    void test() {
        CaseInsensitiveStringV1 cis = new CaseInsensitiveStringV1("V1");
        String s = "V1";

        boolean cisEquals = cis.equals(s);
        boolean stringEquals = s.equals(cis);

        log.info("cisEquals={}", cisEquals);
        log.info("stringEquals={}", stringEquals);

        CaseInsensitiveStringV1 cis2 = new CaseInsensitiveStringV1("V1");

        boolean equals = cis.equals(cis2);
        log.info("cis.eq(cis2)={}", equals);
    }

}
