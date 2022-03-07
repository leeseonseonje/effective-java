package effective.java;

import effective.java.effectivejava.ZZ;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.Set;

@Slf4j
public class ZZTest {

    @Test
    void test() {
        ZZ<String> zz = new ZZ<>();
        zz.name();
    }
}
