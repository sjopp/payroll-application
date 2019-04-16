package com.jopp.springrestservice.repository;

import com.jopp.springrestservice.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
