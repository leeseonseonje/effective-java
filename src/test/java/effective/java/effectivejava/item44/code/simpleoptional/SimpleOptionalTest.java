package effective.java.effectivejava.item44.code.simpleoptional;

import effective.java.effectivejava.item44.code.Member;
import effective.java.effectivejava.item44.code.MemberRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.function.Supplier;

import static org.assertj.core.api.Assertions.*;

public class SimpleOptionalTest {

    private final MemberRepository memberRepository = new MemberRepository();

    @Test

    void simpleOptionalTest() {

        Member member = new Member("Seon", 25);
        memberRepository.save(member);
        Member seon = memberRepository.findMember("Seon");
        Member nullMember = memberRepository.findMember("nullMember");
        Supplier<Member> supplier = () -> new Member("nullMember", 0);

        SimpleOptional<Member> seonOptional = SimpleOptional.of(seon);
        Member seonResult = seonOptional.orElseGet(supplier);

        SimpleOptional<Member> nullMemberOptional = SimpleOptional.of(nullMember);
        Member nullMemberResult = nullMemberOptional.orElseGet(supplier);

        assertThat(seonResult.getUsername()).isEqualTo("Seon");
        assertThat(nullMemberResult.getUsername()).isEqualTo("nullMember");
    }
}
