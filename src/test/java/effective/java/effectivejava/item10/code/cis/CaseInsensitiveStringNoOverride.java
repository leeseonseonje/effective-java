package effective.java.effectivejava.item10.code.cis;


import java.util.Objects;

public class CaseInsensitiveStringNoOverride {

    private final String s;

    public CaseInsensitiveStringNoOverride(String s) {
        this.s = Objects.requireNonNull(s);
    }
}
