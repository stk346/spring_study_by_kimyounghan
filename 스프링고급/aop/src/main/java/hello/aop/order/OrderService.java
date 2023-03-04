package hello.aop.order;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class OrderService {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public void orderItem(String itemId) {
        // aop proxy인 AspectV1의 doLog() 메서드가 먼저 실행된 후 아래의 코드가 실행된다.
        log.info("[orderService] 실행");
        orderRepository.save(itemId);
    }

}