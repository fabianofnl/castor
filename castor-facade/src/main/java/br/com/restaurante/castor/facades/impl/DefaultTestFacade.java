package br.com.restaurante.castor.facades.impl;

import br.com.restaurante.castor.facades.TestFacade;
import br.com.restaurante.castor.services.TestService;
import org.springframework.stereotype.Service;

@Service
public class DefaultTestFacade implements TestFacade
{
    private TestService testService;

    public DefaultTestFacade(TestService testService)
    {
        this.testService = testService;
    }

    @Override
    public String getAnotherName()
    {
        return " valor do facade. " + testService.getAnotherName();
    }
}
