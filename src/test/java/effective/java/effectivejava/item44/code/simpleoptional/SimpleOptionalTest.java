package effective.java.effectivejava.item44.code.simpleoptional;

import effective.java.effectivejava.item44.code.member.Member;
import effective.java.effectivejava.item44.code.member.MemberRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Optional;
import java.util.function.Supplier;

import static org.assertj.core.api.Assertions.*;

public class SimpleOptionalTest {

    private final MemberRepository memberRepository = new MemberRepository();
    private Member member;
    private Member seon;
    private Member nullMember;
    private Supplier<Member> supplier;

    @BeforeEach
    void init() {
        member = new Member("Seon", 25);
        memberRepository.save(member);
        seon = memberRepository.findMember("Seon");
        nullMember = memberRepository.findMember("null");
        System.out.println(nullMember);
        supplier = () -> new Member("nullMember", 0);
    }

    @Test
    void simpleOptionalTest() {

        SimpleOptional<Member> seonOptional = SimpleOptional.of(seon);
        Member seonResult = seonOptional.orElseGet(supplier);

        SimpleOptional<Member> nullMemberOptional = SimpleOptional.of(nullMember);
        Member nullMemberResult = nullMemberOptional.orElseGet(supplier);

        assertThat(seonResult.getUsername()).isEqualTo("Seon");
        assertThat(nullMemberResult.getUsername()).isEqualTo("nullMember");
    }
}
