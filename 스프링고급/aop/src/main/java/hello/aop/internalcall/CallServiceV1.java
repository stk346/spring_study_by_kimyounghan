
package hello.aop.internalcall;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class CallServiceV1 {

    private CallServiceV1 callServiceV1;

    // CallServiceV1이 자기 자신을 가지고 있기 때문에 생성자에서 이 객체를 주입하면 순환참조 문제가 발생
    // 이 문제는 setter를 통해 객체가 생성된 이후 주입받는 방식으로 해결이 가능하다.
    @Autowired
    public void setCallServiceV1(CallServiceV1 callServiceV1) {
        this.callServiceV1 = callServiceV1;
    }

    public void external() {
        log.info("call external");
        callServiceV1.internal(); // 외부 메서드 호출
    }

    public void internal() {
        log.info("call internal");
    }
}
