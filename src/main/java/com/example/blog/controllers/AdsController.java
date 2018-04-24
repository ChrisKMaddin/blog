package com.example.blog.controllers;

import com.example.blog.models.Ad;
import com.example.blog.repositories.AdRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class AdsController {

    private final AdRepository adDao;

    public AdsController(AdRepository adDao) {
        this.adDao = adDao;
    }

    @GetMapping("/ads")
    public String index(Model model) {
        model.addAttribute("ads", adDao.findAll());
        return "ads/index";
    }

    @GetMapping("/ads/create")
    public String showCreateForm(Model model) {
        model.addAttribute("ad", new Ad());
        return "ads/create_ad";
    }

    @PostMapping("/ads/create")
    public String create(@Valid Ad ad, Errors validation, Model model) {
        if (validation.hasErrors()) {
            model.addAttribute("errors", validation);
            model.addAttribute("ad", ad);
            return "ads/create_ad";
        } else {
            return "redirect:/ads";
        }
    }

    @GetMapping("/ads.json")
    @ResponseBody
    public Iterable<Ad> viewAllAdsInJSONFormat() {
        return adDao.findAll();
    }

    @GetMapping("/ads/ajax")
    public String viewAllAdsWithAjax() {
        return "ads/ajax";
    }

}