package effective.java.effectivejava.item10.cistest;

import effective.java.effectivejava.item10.code.cis.CaseInsensitiveStringV0;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class CisTestV0 {

    private final CaseInsensitiveStringV0 cis = new CaseInsensitiveStringV0("Test");
    private final String s = "Test";

    @Test
    void equalsOverrideTest() {
        log.info("cis.equals(s)={}", cis.equals(s));
        log.info("s.equals(cis)={}", s.equals(cis));
    }

    @Test
    void containsTest() {
        List<CaseInsensitiveStringV0> list = new ArrayList<>();
        list.add(cis);

        log.info("list.contains(s)={}", list.contains(s));
    }
}
