package br.com.restaurante.castor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PageController
{
    @GetMapping("/page")
    public String page(@RequestParam(value = "name", defaultValue = "World") String name, Model model)
    {
        model.addAttribute("mensagem", name);
        return "home";
    }
}
