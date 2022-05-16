package hello.core.member;
// mpl 관례 , 구현체 하나만 있을떄 씀
public class MemberServicempl implements MemberService{

    // 기본 구조
    // MemoryMemberRepository 넣어주면 된다.
    // MemoryMemberRepository에서 save() 오버라이딩
    //cmd + shift +enter

    private final MemberRepository memberRepository ;

    //메모리 구현 생성자를 통해서
    public MemberServicempl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void join(Member member) {
        memberRepository.save(member);

    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
