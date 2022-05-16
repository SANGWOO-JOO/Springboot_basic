package hello.core.member;

<<<<<<< HEAD
import hello.core.order.AppConfig;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
=======
import org.assertj.core.api.Assertions;
>>>>>>> 6f2fac68bd6aa1c7df72fbb35dc86f739381d290
import org.junit.jupiter.api.Test;

public class MemberServiceTest {

<<<<<<< HEAD
    MemberService memberService;

    // 테스트 전 실행되는 것
    // 테스트 돌릴 때 레포지토리를 넣음 : DI
    @BeforeEach
    public void beforeEach(){
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
    }

=======
    MemberService memberService =new MemberServicempl();
>>>>>>> 6f2fac68bd6aa1c7df72fbb35dc86f739381d290

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
