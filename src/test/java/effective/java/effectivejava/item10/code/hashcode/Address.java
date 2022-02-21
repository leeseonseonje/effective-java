package effective.java.effectivejava.item10.code.hashcode;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Address {

    private String city;
    private String street;
    private String zipcode;

    @Override
    public int hashCode() {
        int result = city.hashCode();
        result = 31 * result + street.hashCode();
        result = 31 * result + zipcode.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Address)) {
            return false;
        }
        Address address = (Address) obj;
        return address.city.equals(city) &&
                address.street.equals(street) &&
                address.zipcode.equals(zipcode);
    }
}
