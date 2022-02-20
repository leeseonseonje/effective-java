package effective.java.effectivejava.item10.code.cis;


import java.util.Objects;

public class CaseInsensitiveStringV1 {

    private final String s;

    public CaseInsensitiveStringV1(String s) {
        this.s = Objects.requireNonNull(s);
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof CaseInsensitiveStringV1 &&
                ((CaseInsensitiveStringV1) o).s.equalsIgnoreCase(s);
    }
}
