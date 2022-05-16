package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServicempl;
<<<<<<< HEAD
import hello.core.order.AppConfig;
=======
>>>>>>> 6f2fac68bd6aa1c7df72fbb35dc86f739381d290
import hello.core.order.Order;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;

public class OrderApp {

    //psvm
    public static void main(String[] args) {
<<<<<<< HEAD

        AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberService();
        OrderService orderService = appConfig.orderService();

//        MemberService memberService =new MemberServicempl();
//        OrderService orderService =new OrderServiceImpl();
=======
        MemberService memberService =new MemberServicempl();
        OrderService orderService =new OrderServiceImpl();
>>>>>>> 6f2fac68bd6aa1c7df72fbb35dc86f739381d290

        //멤버아이디
        Long memberId = 1L;
        Member member =new Member(memberId,"memberA", Grade.VIP);
        memberService.join(member);

<<<<<<< HEAD
        Order order = orderService.createOrder(memberId, "itemA",10000);
=======
        Order order =orderService.createOrder(memberId, "itemA",10000);
>>>>>>> 6f2fac68bd6aa1c7df72fbb35dc86f739381d290

        //toString으로 실행
        System.out.println("order=" +order);
        //할인된 가격
        System.out.println("order=" +order.calculatePrice());

    }
}
