package homework.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PrintMethodInfo {
    @Before("execution(* homework.aop.service.FindElementService.*Search(..))")
    public void printMethodInfo(JoinPoint joinPoint){
        System.out.println(joinPoint.getSignature() + "가 호출되었습니다.");
        for(Object obj : joinPoint.getArgs()){
            System.out.println("인자 : " + obj);
        }
    }
}
