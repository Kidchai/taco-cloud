package com.kidchai.tacocloud.web.api;

import com.kidchai.tacocloud.data.TacoRepository;
import com.kidchai.tacocloud.models.Taco;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/tacos",
                produces = "application/json")
@CrossOrigin(origins = {"http://tacocloud:8080", "http://tacocloud.com"})
public class TacoController {

}
