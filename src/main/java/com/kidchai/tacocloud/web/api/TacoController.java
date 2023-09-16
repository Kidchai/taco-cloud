package com.kidchai.tacocloud.web.api;

import com.kidchai.tacocloud.data.TacoRepository;
import com.kidchai.tacocloud.models.Taco;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "/api/tacos",
                produces = "application/json")
@CrossOrigin(origins = {"http://localhost:8080", "http://tacocloud.com"})
public class TacoController {
    private final TacoRepository tacoRepo;

    @Autowired
    public TacoController(TacoRepository tacoRepo) {
        this.tacoRepo = tacoRepo;
    }

    @GetMapping(produces = "application/json")
    public Iterable<Taco> getAllTacos() {
        return tacoRepo.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Taco> tacoById(@PathVariable("id") Long id) {
        Optional<Taco> optTaco = tacoRepo.findById(id);
        return optTaco.map(taco -> new ResponseEntity<>(taco, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(null, HttpStatus.NOT_FOUND));
    }

    @PostMapping(consumes="application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public Taco postTaco(@RequestBody Taco taco) {
        return tacoRepo.save(taco);
    }
}
