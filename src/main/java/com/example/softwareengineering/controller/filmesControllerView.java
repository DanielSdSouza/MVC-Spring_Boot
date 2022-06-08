package com.example.softwareengineering.controller;

import com.example.softwareengineering.models.filmes;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/filmes/api")
public class filmesControllerView {

    private List<filmes> filme = new ArrayList<>();

    filmesControllerView() {
        filme.add(new filmes("Toy Story", 120));
        filme.add(new filmes("Avatar", 130));
        filme.add(new filmes("Bob esponja", 90));
    }

    @GetMapping
    List<filmes> getfilmes() {
        return filme;
    }
}
