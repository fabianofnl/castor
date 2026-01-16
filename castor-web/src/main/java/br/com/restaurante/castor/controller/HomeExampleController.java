package br.com.restaurante.castor.controller;

import br.com.restaurante.castor.dtos.PessoaDTO;
import br.com.restaurante.castor.facades.ExampleFacade;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class HomeExampleController
{
    private static final Logger LOGGER = LoggerFactory.getLogger(HomeExampleController.class);

    private final ExampleFacade exampleFacade;

    public HomeExampleController(ExampleFacade testFacade)
    {
        this.exampleFacade = testFacade;
    }

    @GetMapping("/page")
    public String page(@RequestParam(value = "name", required = false) String name, Model model)
    {
        LOGGER.info("Chamou page");
        model.addAttribute("name", name);

        List<PessoaDTO> pessoas = exampleFacade.searchPessoaByName(name);
        model.addAttribute("pessoas", pessoas);

        PessoaDTO pessoaDTO = exampleFacade.findByName(name);
        model.addAttribute("pessoa", pessoaDTO);

        return "example";
    }
}
