package hello.core.member;
// mpl 관례 , 구현체 하나만 있을떄 씀
public class MemberServicempl implements MemberService{

    // 기본 구조
    // MemoryMemberRepository 넣어주면 된다.
    // MemoryMemberRepository에서 save() 오버라이딩
    //cmd + shift +enter
<<<<<<< HEAD

    private final MemberRepository memberRepository ;

    //메모리 구현 생성자를 통해서
    public MemberServicempl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }
=======
    private final MemberRepository memberRepository = new MemoryMemberRepository();
>>>>>>> 6f2fac68bd6aa1c7df72fbb35dc86f739381d290

    @Override
    public void join(Member member) {
        memberRepository.save(member);

    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
