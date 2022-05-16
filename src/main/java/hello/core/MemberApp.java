package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServicempl;
<<<<<<< HEAD
import hello.core.order.AppConfig;
=======
>>>>>>> 6f2fac68bd6aa1c7df72fbb35dc86f739381d290

public class MemberApp {
    // psvm 꿀팁
    public static void main(String[] args) {

<<<<<<< HEAD
        AppConfig appConfig =new AppConfig();
        MemberService memberService =appConfig.memberService();
        // MemberService memberService = new MemberServicempl();

=======
        MemberService memberService = new MemberServicempl();
>>>>>>> 6f2fac68bd6aa1c7df72fbb35dc86f739381d290
        // member Join
        Member member = new Member(1L, "memberA", Grade.VIP);
        //회원가입 완료
        memberService.join(member);

        // 가입이 제대로 됐는지 확인 ..
        // 가입 == find 멤버
        Member findMember = memberService.findMember(1L);
        System.out.println("new member =" + member.getName());
            System.out.println("find Member =" + findMember.getName());
    }
}
