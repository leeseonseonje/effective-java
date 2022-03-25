package effective.java.effectivejava.item44.code;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

import static org.assertj.core.api.Assertions.*;

public class UnaryFunctionTest {

    MemberRepository memberRepository = new MemberRepository();

    @Test
    void test() {
        Member member = new Member("Seon", 25);

        memberRepository.save(member);

        UnaryOperator<Member> unaryOperator = this::notNullMember;
        Supplier<Member> supplier = this::nullMember;

        Member findMember = memberCheck(unaryOperator, supplier, "Seon");
        Member nullMember = memberCheck(unaryOperator, supplier, "Dong");

        assertThat(findMember.getUsername()).isEqualTo("Seon");
        assertThat(nullMember.getUsername()).isEqualTo("default");
    }

    private Member notNullMember(Member member) {
        return member;
    }

    private Member nullMember() {
        return new Member("default", 0);
    }

    private Member memberCheck(UnaryOperator<Member> unaryOperator, Supplier<Member> supplier, String username) {
        Member member = memberRepository.findMember(username);
        if (member == null) {
            return supplier.get();
        } else {
            return unaryOperator.apply(member);
        }
    }
}
