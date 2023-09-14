package com.kidchai.tacocloud.data;

import com.kidchai.tacocloud.models.Taco;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TacoRepository extends CrudRepository<Taco, Long> {
}