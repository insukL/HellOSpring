package homework.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
@Aspect
public class CountCallMethods {
    int callCount = 0;
    @After("execution(* homework.aop.service.PrintAccessService.printAccess(..))")
    public void countAccess(JoinPoint joinPoint){
        ++callCount;
        System.out.println("지금까지 " + joinPoint.getSignature().getName()
                + "메소드가 " + callCount + "번 호출되었습니다.");
    }
}
