package effective.java.effectivejava.item44.code.simpleoptional;

import effective.java.effectivejava.item44.code.member.Member;
import effective.java.effectivejava.item44.code.member.MemberRepository;
import effective.java.effectivejava.item44.code.member.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.function.Supplier;

import static org.assertj.core.api.Assertions.*;

public class SimpleOptionalTest {

    private final MemberRepository memberRepository = new MemberRepository();
    private Member member;
    private Member seon;
    private Member nullMember;
    private Supplier<User> supplier;

    @BeforeEach
    void init() {
        member = new Member("Seon", 25);
        memberRepository.save(member);
        seon = memberRepository.findMember("Seon");
        nullMember = memberRepository.findMember("null");
        supplier = () -> new User("nullMember", 0);
    }

    @Test
    void simpleOptionalTest() {

        SimpleOptional<Member> seonOptional = SimpleOptional.of(seon);
        Member seonResult = seonOptional.orElseGet(supplier);

        SimpleOptional<Member> memberSimpleOptional = SimpleOptional.ofNullable(nullMember);
        Member member = memberSimpleOptional.orElseGet(supplier);

        Member 에러 = memberSimpleOptional.orElseThrow(() -> new IllegalStateException("에러"));
        assertThat(seonResult.getUsername()).isEqualTo("Seon");
        assertThat(member.getUsername()).isEqualTo("nullMember");


        seonOptional.ifPresent(m -> m.setUsername("seonJe"));
        assertThat(seonResult.getUsername()).isEqualTo("seonJe");
    }
}
