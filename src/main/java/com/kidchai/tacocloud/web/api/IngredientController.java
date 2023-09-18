package com.kidchai.tacocloud.web.api;

import com.kidchai.tacocloud.data.IngredientRepository;
import com.kidchai.tacocloud.models.Ingredient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/ingredients", produces = "application/json")
@CrossOrigin(origins = {"http://localhost:8080", "http://tacocloud.com"})
public class IngredientController {

    private final IngredientRepository ingredientRepo;

    @Autowired
    public IngredientController(IngredientRepository ingredientRepo) {
        this.ingredientRepo = ingredientRepo;
    }

    @GetMapping
    public Iterable<Ingredient> allIngredients() {
        return ingredientRepo.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Ingredient saveIngredient(@RequestBody Ingredient ingredient) {
        return ingredientRepo.save(ingredient);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteIngredient(@PathVariable("id") String ingredientId) {
        ingredientRepo.deleteById(ingredientId);
    }
}
