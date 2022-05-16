package hello.core.member;

import hello.core.order.AppConfig;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {

    MemberService memberService;

    // 테스트 전 실행되는 것
    // 테스트 돌릴 때 레포지토리를 넣음 : DI
    @BeforeEach
    public void beforeEach(){
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
    }


    @Test
    void join(){
        //given
        Member member =new Member(1L, "memberA",Grade.VIP);

        // when
        memberService.join(member);
        Member findMember = memberService.findMember(1L);

        //then
        // Assertions : 검색
        Assertions.assertThat(member).isEqualTo(findMember);
    }
}
