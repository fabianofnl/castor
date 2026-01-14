package br.com.restaurante.castor.controller;

import br.com.restaurante.castor.facades.TestFacade;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController
{
    private TestFacade testFacade;

    public HelloWorldController(TestFacade testFacade)
    {
        this.testFacade = testFacade;
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name)
    {
        name += testFacade.getAnotherName();

        return String.format("Hello, %s!", name);
    }
}
