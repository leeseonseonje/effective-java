package effective.java.effectivejava.item33;

import effective.java.effectivejava.item33.code.Favorites;
import effective.java.effectivejava.item33.code.FavoritesInstance;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class Item33Test {

    @Test
    void test() {
        Favorites favorites = new Favorites();

        favorites.put(String.class, "String");
        favorites.put(Integer.class, 1900);
        favorites.put(FavoritesInstance.class, new FavoritesInstance("Instance", 2022));

        assertThat(favorites.get(String.class)).isEqualTo("String");
        assertThat(favorites.get(Integer.class)).isEqualTo(1900);
        assertThat(favorites.get(FavoritesInstance.class).getValue()).isEqualTo("Instance");
        assertThat(favorites.get(FavoritesInstance.class).getInteger()).isEqualTo(2022);
    }
}
