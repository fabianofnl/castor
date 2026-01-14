package br.com.restaurante.castor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StyleController
{
    @GetMapping("/style")
    public String style(Model model)
    {
        model.addAttribute("message", "Boostrap Styles");
        return "style";
    }
}
