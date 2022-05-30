package hello.core.member;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
// 회원 저장소
@Component
public class MemoryMemberRepository implements MemberRepository {

    // 저장소 만듦 , Map<> 입문 강의에 많이 한거 같다.
    private static Map<Long, Member> store =new HashMap<>();

    // put
    @Override
    public void save(Member member) {
        store.put(member.getId(), member);
    }
    // get으로 Id 찾는 것
    @Override
    public Member findById(Long memberId) {
        return store.get(memberId);
    }
}
