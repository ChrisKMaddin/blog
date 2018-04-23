package com.example.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class RollDiceController {

    @GetMapping("/roll-dice")
    public String showGame() {
        return "roll-dice-form";
    }

    @GetMapping("/roll-dice/{guess}")
    public String play(@PathVariable int guess, Model model) {
        int rnd = (int) (Math.random() * 6 + 1);

        model.addAttribute("result", (guess == rnd));
        model.addAttribute("number", rnd);
        return "dice-outcome";



    }

}
