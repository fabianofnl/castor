package br.com.restaurante.castor.controller;

import br.com.restaurante.castor.facades.TestFacade;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PageController
{
    private TestFacade testFacade;

    public PageController(TestFacade testFacade)
    {
        this.testFacade = testFacade;
    }

    @GetMapping("/page")
    public String page(@RequestParam(value = "name", defaultValue = "World") String name, Model model)
    {
        name += testFacade.getAnotherName();
        model.addAttribute("mensagem", name);
        return "home";
    }
}
