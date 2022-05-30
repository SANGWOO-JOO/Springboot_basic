package hello.core.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// mpl 관례 , 구현체 하나만 있을떄 씀
@Component
public class MemberServicempl implements MemberService{

    // 기본 구조
    // MemoryMemberRepository 넣어주면 된다.
    // MemoryMemberRepository에서 save() 오버라이딩
    //cmd + shift +enter

    private final MemberRepository memberRepository ;

    @Autowired
    //생성자에게 붙혀준다.
    public MemberServicempl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void join(Member member) {
        memberRepository.save(member); // 실행에만 집중

    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }

    //테스트 코드
    public MemberRepository getMemberRepository(){
        return memberRepository;
    }
}
