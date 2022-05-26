package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServicempl;
import hello.core.order.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MemberApp {
    // psvm 꿀팁
    public static void main(String[] args) {

     //   AppConfig appConfig =new AppConfig();
     //   MemberService memberService =appConfig.memberService();

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        // 찾는 것은 memberService, 타입(반환타입) MemberService.class
        MemberService memberService = applicationContext.getBean("memberService", MemberService.class);
        // member Join
        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);

        // 가입이 제대로 됐는지 확인 ..
        // 가입 == find 멤버
        Member findMember = memberService.findMember(1L);
        System.out.println("new member =" + member.getName());
            System.out.println("find Member =" + findMember.getName());
    }
}
