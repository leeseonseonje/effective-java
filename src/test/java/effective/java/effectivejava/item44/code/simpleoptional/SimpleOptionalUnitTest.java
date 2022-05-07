package effective.java.effectivejava.item44.code.simpleoptional;

import effective.java.effectivejava.item44.code.member.Member;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class SimpleOptionalUnitTest {

    @Test
    void NPETest() {
        assertThatThrownBy(() -> SimpleOptional.of(null)).isInstanceOf(NullPointerException.class);
    }

    @Test
    void ofNullableTest() {
        SimpleOptional<Object> nullable = SimpleOptional.ofNullable(null);
        assertThat(nullable.get()).isNull();
    }

    @Test
    void orElseGetTest() {
        SimpleOptional<Member> optional = SimpleOptional.ofNullable(null);

        Member member = optional.orElseGet(() -> new Member("name", 20));

        assertThat(member.getUsername()).isEqualTo("name");
        assertThat(member.getAge()).isEqualTo(20);
    }

    @Test
    void orElseThrowTest() {
        SimpleOptional<Member> optional = SimpleOptional.ofNullable(null);

        assertThatThrownBy(() -> optional.orElseThrow(() -> new IllegalStateException("예외 발생")))
                .isInstanceOf(IllegalStateException.class);
    }

    @Test
    void ifPresentTest() {
        Member member = new Member("name", 20);
        SimpleOptional<Member> optional = SimpleOptional.of(member);

        optional.ifPresent(m -> m.setUsername("username"));

        assertThat(optional.get().getUsername()).isEqualTo("username");
    }
}
