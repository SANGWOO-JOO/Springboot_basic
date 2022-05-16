package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServicempl;
import hello.core.order.AppConfig;
import hello.core.order.Order;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;

public class OrderApp {

    //psvm
    public static void main(String[] args) {

        AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberService();
        OrderService orderService = appConfig.orderService();

//        MemberService memberService =new MemberServicempl();
//        OrderService orderService =new OrderServiceImpl();

        //멤버아이디
        Long memberId = 1L;
        Member member =new Member(memberId,"memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA",10000);

        //toString으로 실행
        System.out.println("order=" +order);
        //할인된 가격
        System.out.println("order=" +order.calculatePrice());

    }
}
