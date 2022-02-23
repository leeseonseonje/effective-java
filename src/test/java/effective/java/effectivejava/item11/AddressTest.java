package effective.java.effectivejava.item11;

import effective.java.effectivejava.item11.hashcode.Address;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@Slf4j
public class AddressTest {

    Address getEqualsAddress() {
        return new Address("city", "street", "zipcode");
    }

    Address getNotEqualsAddress() {
        return new Address("city2", "street", "zipcode");
    }

    @Test
    void equalsTrueTest() {
        Address address1 = getEqualsAddress();
        Address address2 = getEqualsAddress();

        assertThat(address1.equals(address2)).isTrue();
    }

    @Test
    void equalsFalseTest() {
        Address address1 = getEqualsAddress();
        Address address2 = getNotEqualsAddress();

        assertThat(address1.equals(address2)).isFalse();
    }

    @Test
    void hashCodeTrueTest() {
        Address address1 = getEqualsAddress();
        Address address2 = getEqualsAddress();

        log.info("address1={}, address1.toString()={}", address1.hashCode(), address1);
        log.info("address2={}, address2.toString()={}", address2.hashCode(), address2);
        assertThat(address1.hashCode() == address2.hashCode()).isTrue();
    }

    @Test
    void hashCodeFalseTest() {
        Address address1 = getEqualsAddress();
        Address address2 = getNotEqualsAddress();

        log.info("address1={}", address1.hashCode());
        log.info("address2={}", address2.hashCode());
        assertThat(address1.hashCode() == address2.hashCode()).isFalse();
    }

    @Test
    void toStringOverrideTest() {
        Address address1 = getEqualsAddress();
        Address address2 = getNotEqualsAddress();

        log.info("address1={}", address1);
        log.info("address2={}", address2);
    }
}
