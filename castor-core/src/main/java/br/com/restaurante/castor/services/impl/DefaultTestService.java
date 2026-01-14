package br.com.restaurante.castor.services.impl;

import br.com.restaurante.castor.services.TestService;
import org.springframework.stereotype.Service;

@Service
public class DefaultTestService implements TestService
{
    @Override
    public String getAnotherName()
    {
        return " valor do service ";
    }
}
