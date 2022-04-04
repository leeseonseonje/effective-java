package effective.java.effectivejava.item47;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

import static java.util.Comparator.*;
import static java.util.stream.Collectors.*;

public class Item47Test {

    @Test
    void test() {
        List<String> list = List.of("1", "2", "3");

        Map<String, List<String>> collect = list.stream().filter(e -> e.equals("A") || e.equals("B"))
                .collect(groupingBy(e -> e));

        collect.keySet().forEach(m -> System.out.println(m + ": " + collect.get(m)));
    }

    @Test
    void test2() {
        List<String> list = List.of("S", "S", "A", "B", "A", "C");
//        Map<String, Integer> collect = list.stream().collect(toMap(e -> e, e -> 1));

        List<Member> members = List.of(new Member("A", 1),
                new Member("A", 100),
                new Member("B", 50),
                new Member("B", 30),
                new Member("SEON", 25));

        Map<String, Integer> map = members.stream()
                .collect(toMap(Member::getUsername, Member::getAge, BinaryOperator.maxBy(comparing(e -> e))));

        map.keySet().forEach(e -> System.out.println(e + " : " + map.get(e)));


        Map<String, Long> count = list.stream().collect(groupingBy(e -> e, counting()));
        count.keySet().forEach(e -> System.out.println(e + count.get(e)));
    }
}

class Member {
    private String username;
    private int age;

    public Member(String username, int age) {
        this.username = username;
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Member{" +
                "username='" + username + '\'' +
                ", age=" + age +
                '}';
    }
}
