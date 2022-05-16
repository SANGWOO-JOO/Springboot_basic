package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;
//DiscountPolicy에 대한 구현체 만들기
public class FixDiscountPolicy implements DiscountPolicy{
    int dicountFixAmuont =1000;
    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP){
            return dicountFixAmuont;
        } else {
            return 0;
        }
    }
}
