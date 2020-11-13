package homework.aop.aspect;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class CheckCurrentUsers {
    long currentUsers = 0;

    @AfterReturning("execution(* homework.aop.service.SimpleLoginService.login(..))")
    public void plusCurrentUsers(){
        ++currentUsers;
        System.out.println("현재 " + currentUsers + "명이 접속해있습니다.");
    }

    @AfterReturning("execution(* homework.aop.service.SimpleLoginService.logout(..))")
    public void minusCurrentUsers(){
        --currentUsers;
    }
}
