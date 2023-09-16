package com.kidchai.tacocloud.data;

import com.kidchai.tacocloud.models.Taco;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TacoRepository extends MongoRepository<Taco, Long> {
}