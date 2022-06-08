package com.example.softwareengineering.controller;

import com.example.softwareengineering.models.filmes;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/filmes")
public class filmesController {

    private List<filmes> filme = new ArrayList<>();

    filmesController() {
        filme.add(new filmes("Toy Story", 120));
        filme.add(new filmes("Avatar", 130));
        filme.add(new filmes("Bob esponja", 90));
    }

    @GetMapping
    private String filmesView(Model model) {
        model.addAttribute("filmes", filme);
        return "filmes";
    }
}
