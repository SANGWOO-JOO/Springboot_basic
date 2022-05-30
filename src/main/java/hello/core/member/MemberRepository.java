package hello.core.member;
// 인터페이스 구현
public interface MemberRepository {

    // 회원 저장하는 것
    void save(Member member);
    // 회원의 Id로 회원 찾는 기능
    Member findById(Long memberId);
}
