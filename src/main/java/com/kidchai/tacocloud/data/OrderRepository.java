package com.kidchai.tacocloud.data;

import com.kidchai.tacocloud.TacoOrder;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<TacoOrder, Long> {
}
