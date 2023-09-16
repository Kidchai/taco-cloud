package com.kidchai.tacocloud.data;

import com.kidchai.tacocloud.models.TacoOrder;
import com.kidchai.tacocloud.models.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrderRepository extends CrudRepository<TacoOrder, Long> {
    List<TacoOrder> findByUserOrderByPlacedAtDesc (User user);
}
