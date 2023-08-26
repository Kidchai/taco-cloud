package com.kidchai.tacocloud.util;

import com.kidchai.tacocloud.Ingredient;
import com.kidchai.tacocloud.IngredientUDT;
import com.kidchai.tacocloud.Taco;
import com.kidchai.tacocloud.TacoUDT;

public class TacoUDRUtils {
    public static IngredientUDT toIngredientUDT(Ingredient ingredient) {
        return new IngredientUDT(ingredient.getName(), ingredient.getType());
    }

    public static TacoUDT toTacoUDT(Taco taco) {
        return new TacoUDT(taco.getName(), taco.getIngredients());
    }
}
