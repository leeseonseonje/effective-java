package effective.java.effectivejava.item37;

import effective.java.effectivejava.item37.code.LifeCycle;
import effective.java.effectivejava.item37.code.Plant;
import org.junit.jupiter.api.Test;

import java.util.EnumMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class item37Test {

    @Test
    void enumMapTest() {
        Map<LifeCycle, Set<Plant>> enumMap = new EnumMap<>(LifeCycle.class);

        for (LifeCycle lifeCycle : LifeCycle.values()) {
            enumMap.put(lifeCycle, new HashSet<>());
        }

        Set<Plant> set = new HashSet<>();
        set.add(new Plant("장미", LifeCycle.ANNUAL));
        set.add(new Plant("무궁화", LifeCycle.ANNUAL));
        set.add(new Plant("튤립", LifeCycle.BIENNIAL));
        set.add(new Plant("카네이션", LifeCycle.PERENNIAL));
        set.add(new Plant("백합", LifeCycle.PERENNIAL));

        for (Plant plant : set) {
            enumMap.get(plant.getLifeCycle()).add(plant);
        }

        enumMap.keySet().forEach(e -> System.out.println(e + ", " + enumMap.get(e)));
    }
}
