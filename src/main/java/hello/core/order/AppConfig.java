package hello.core.order;

import hello.core.discount.DiscountPolicy;
import hello.core.discount.FixDiscountPolicy;
import hello.core.discount.RateDiscountPolicy;
import hello.core.member.MemberService;
import hello.core.member.MemberServicempl;
import hello.core.member.MemoryMemberRepository;

// 구현 객체를 생성
// 주입 , 연결

public class AppConfig {

    public MemberService memberService(){
        // 이 코드 이해하기
        // 생성자 주입
     return new MemberServicempl(memberRepository());
    }

    private MemoryMemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    // 생성자 주입
    public OrderService orderService(){
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }
    public DiscountPolicy discountPolicy(){
        return new RateDiscountPolicy();
    }
}
