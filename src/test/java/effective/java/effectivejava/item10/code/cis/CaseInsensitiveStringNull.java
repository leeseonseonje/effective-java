package effective.java.effectivejava.item10.code.cis;


import java.util.Objects;

public class CaseInsensitiveStringNull {

    private final String s;

    public CaseInsensitiveStringNull(String s) {
        this.s = Objects.requireNonNull(s);
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof CaseInsensitiveStringNull;
    }
}
