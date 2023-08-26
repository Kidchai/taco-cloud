package com.kidchai.tacocloud.data;

import com.kidchai.tacocloud.TacoOrder;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface OrderRepository extends CrudRepository<TacoOrder, UUID> {
}
