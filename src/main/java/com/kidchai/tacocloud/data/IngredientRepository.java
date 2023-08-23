package com.kidchai.tacocloud.data;

import com.kidchai.tacocloud.Ingredient;
import org.springframework.data.repository.CrudRepository;

public interface IngredientRepository extends CrudRepository<Ingredient, String> {
}
