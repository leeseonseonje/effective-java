package effective.java.effectivejava.item44.code.member;

import effective.java.effectivejava.item44.code.member.Member;

import java.util.HashMap;
import java.util.Map;

public class MemberRepository {

    private static final Map<String, Member> map = new HashMap<>();

    public void save(Member member) {
        map.put(member.getUsername(), member);
    }

    public Member findMember(String username) {
        return map.get(username);
    }
}
