package hello.core.beanfind;

import hello.core.member.MemberService;
import hello.core.member.MemberServicempl;
import hello.core.order.AppConfig;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

public class ApplicationContextBasicFindText {

    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

    @Test
    @DisplayName("빈 이름으로 조회")
    void findBeanByName1(){
        MemberService memberSerevice = ac.getBean("memberSerevice", MemberService.class);
        assertThat(memberSerevice).isInstanceOf(MemberServicempl.class);
    }

    @Test
    @DisplayName("이름없이 이름으로 조회")
    void findBeanByType(){
        MemberService memberSerevice = ac.getBean("memberSerevice", MemberService.class);
        assertThat(memberSerevice).isInstanceOf(MemberServicempl.class);
    }

/*   @Test
    @DisplayName("빈 이름으로 조회X")
    void findBeanByNameX(){
        // ac.getBean("xxxx", MemberService.class);
       MemberService xxxxx = ac.getBean("xxxxx", MemberService.class);
       // 예외가 터져야한다.
       assertThrows(NoSuchBeanDefinitionException.class,
               //이거 실행
               () -> ac.getBean("xxxxx",MemberService.class ));
   }*/
}
