package hello.core.scan;

import hello.core.member.MemberService;
import hello.core.order.AutoAppConfig;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.hamcrest.MatcherAssert.assertThat;

public class AutoAppConfigTest {
    @Test
    void basicScan(){
        new AnnotationConfigApplicationContext(AutoAppConfig.class);

//        MemberService memberService = ac.getBean(MemberService.class);
//
//        assertThat(memberService).isInstanceOf(MemberService.class);
    }
}
