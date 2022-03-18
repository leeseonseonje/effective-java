package effective.java.effectivejava.item37;

import effective.java.effectivejava.item37.code.LifeCycle;
import effective.java.effectivejava.item37.code.Plant;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

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

        EnumMap<LifeCycle, Set<Plant>> result = set.stream().collect(groupingBy(p -> p.getLifeCycle(), () -> new EnumMap<>(LifeCycle.class), toSet()));
        EnumMap<LifeCycle, List<Plant>> collect = set.stream().collect(groupingBy(p -> p.getLifeCycle(), () -> new EnumMap<>(LifeCycle.class), toList()));
        result.keySet().forEach(e -> System.out.println(e + ", " + result.get(e)));
        collect.keySet().forEach(e -> System.out.println(e + ", " + collect.get(e)));


        for (Plant plant : set) {
            enumMap.get(plant.getLifeCycle()).add(plant);
        }



        //enumMap.keySet().forEach(e -> System.out.println(e + ", " + enumMap.get(e)));
    }
}
