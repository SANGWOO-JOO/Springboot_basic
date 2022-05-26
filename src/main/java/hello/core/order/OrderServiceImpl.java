package hello.core.order;

import hello.core.discount.DiscountPolicy;

import hello.core.discount.FixDiscountPolicy;
import hello.core.member.Member;
import hello.core.member.MemberRepository;
import hello.core.member.MemoryMemberRepository;
// Order서버스에 관련된 것만 해야된다.(Impl = 구현 클래스의 이름을 지을 때 인터페이스 이름을 접두사로 하고, Impl을 접미사로 하는 방식이 보편적)
public class OrderServiceImpl implements OrderService {

    //멤버 찾는 변수
    private final MemberRepository memberRepository;
    //구체적인 것 같까지 선택해서 객체에 할당
    //ex_ 직접 배우를 초빙
    private final DiscountPolicy discountPolicy;

    //생성자는 final로 이루어진게 자동적으로 할당된다.
    public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy discountPolicy) {
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;
    }

    //인터페이스에만 의존
  //  private final DiscountPolicy discount.l  Policy =new FixDiscountPolicy();
    //새로운 할인 정책 설정
  //  private final DiscountPolicy discountPolicy =new RateDiscountPolicy();
    //주문 요청
    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        //회원 정보확인
        Member member = memberRepository.findById(memberId);
        //단일체계 원칙을 지킴, 멤버를 넘겨서 할인 가격 부여
        int discountPrice = discountPolicy.discount(member, itemPrice);
        // 할인된 가격을 받음
        return new Order(memberId, itemName, itemPrice, discountPrice);
    }

    //테스트 코드
    public MemberRepository getMemberRepository(){
        return memberRepository;
    }
}
