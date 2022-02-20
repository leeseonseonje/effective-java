package effective.java.effectivejava.item10.code.cis;


import java.util.Objects;

public class CaseInsensitiveStringV0 {

    private final String s;

    public CaseInsensitiveStringV0(String s) {
        this.s = Objects.requireNonNull(s);
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof CaseInsensitiveStringV0) {
            return s.equalsIgnoreCase(((CaseInsensitiveStringV0) o).s);
        }
        if (o instanceof String) {
            return s.equalsIgnoreCase((String) o);
        }
        return false;
    }
}
