package kitchenpos.order.eatinOrder.infra;

import kitchenpos.order.eatinOrder.domain.Order;
import kitchenpos.order.eatinOrder.domain.OrderStatus;
import kitchenpos.order.eatinOrder.domain.OrderTable;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface OrderRepository {
    Order save(Order order);

    Optional<Order> findById(UUID id);

    List<Order> findAll();

    boolean existsByOrderTableAndStatusNot(OrderTable orderTable, OrderStatus status);
}

