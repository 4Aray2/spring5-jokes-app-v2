package guru.springframework.springJokesApp.controllers;

import guru.springframework.springJokesApp.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    private final JokeService jokeService;

    public JokesController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/joke", ""})
    public String getJoke(Model model) {
        model.addAttribute("joke", jokeService.getRandomQuote());
        return "index";
    }
}