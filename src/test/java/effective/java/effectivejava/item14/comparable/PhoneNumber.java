package effective.java.effectivejava.item14.comparable;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Comparator;

import static java.util.Comparator.*;

@Getter
@AllArgsConstructor
public class PhoneNumber implements Comparable<PhoneNumber> {

    private int one;
    private int two;
    private int three;

    private final Comparator<PhoneNumber> COMPARATOR =
            comparingInt((PhoneNumber pn) -> pn.one)
                    .thenComparing(pn -> pn.two)
                    .thenComparing(pn -> pn.three);

    @Override
    public int compareTo(PhoneNumber pn) {
        return COMPARATOR.compare(this, pn);
    }
}
