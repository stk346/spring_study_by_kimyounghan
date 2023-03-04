package hello.aop.order.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Slf4j
@Aspect
public class AspectV1 {

    /**
     * @Around: 포인트컷
     * doLog(method): 어드바이스
     */
    @Around("execution(* hello.aop.order..*(..))") // hello.aop.order 패키지 및 그 하위 패키지
    public Object doLog(ProceedingJoinPoint joinPoint) throws Throwable {
        log.info("[Log] {}", joinPoint.getSignature()); // join point 시그니처 (반환 타입, 파라미터 등의 정보를 담고 있음)
        return joinPoint.proceed();
    }
}
