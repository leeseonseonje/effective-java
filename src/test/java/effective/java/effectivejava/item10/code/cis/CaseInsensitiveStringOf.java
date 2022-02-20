package effective.java.effectivejava.item10.code.cis;


import lombok.Builder;

public class CaseInsensitiveStringOf {

    private final String s;

    @Builder
    private CaseInsensitiveStringOf(String s) {
        this.s = s;
    }

    public static CaseInsensitiveStringOf of(String s) {
        return CaseInsensitiveStringOf.builder()
                .s(s)
                .build();
    }
}
