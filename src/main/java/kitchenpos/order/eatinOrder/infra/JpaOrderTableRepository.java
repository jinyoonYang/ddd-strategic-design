package kitchenpos.order.eatinOrder.infra;

import kitchenpos.order.eatinOrder.domain.OrderTable;
import kitchenpos.order.eatinOrder.domain.OrderTableRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface JpaOrderTableRepository extends OrderTableRepository, JpaRepository<OrderTable, UUID> {
}
