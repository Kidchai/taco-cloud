package com.kidchai.tacocloud.data;

import com.kidchai.tacocloud.models.TacoOrder;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<TacoOrder, String> {
}
