package hello.core.order;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServicempl;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OrderServiceTest {

    MemberService memberService ;
    OrderService orderService ;

    // 테스트 돌릴 때 레포지토리를 넣음 : DI
    @BeforeEach
    public void beforeEach(){
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
    }


        @Test
        void createOrder(){
            Long memberId =1L;
            Member member =new Member(memberId, "memberA", Grade.VIP);
            memberService.join(member);

            Order order =orderService.createOrder(memberId, "itemA", 10000);
            Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);
            //(order.getDiscountPrice()).isEqualTo(1000)
        }
    }
