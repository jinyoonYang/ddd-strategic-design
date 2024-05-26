package kitchenpos.order.eatinOrder.infra;

import kitchenpos.order.eatinOrder.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface JpaOrderRepository extends OrderRepository, JpaRepository<Order, UUID> {
}