package org.este.application.repo;

import org.este.application.model.Order;

public interface OrderRepository extends org.springframework.data.jpa.repository.JpaRepository<Order, Long> {
}
