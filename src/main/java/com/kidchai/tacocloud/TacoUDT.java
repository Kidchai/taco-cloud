package com.kidchai.tacocloud;

import java.util.List;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.data.cassandra.core.mapping.UserDefinedType;
import lombok.Data;
@Data
@RequiredArgsConstructor
@NoArgsConstructor(force = true)
@UserDefinedType("taco")
public class TacoUDT {
    private final String name;
    private final List<IngredientUDT> ingredients;
}
