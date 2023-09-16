package com.kidchai.tacocloud.data;

import com.kidchai.tacocloud.models.Order;
import com.kidchai.tacocloud.models.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrderRepository extends CrudRepository<Order, Long> {
    List<Order> findByUserOrderByPlacedAtDesc (User user);
}
