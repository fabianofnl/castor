package br.com.restaurante.castor.services.impl;

import br.com.restaurante.castor.daos.ExamplePessoaDao;
import br.com.restaurante.castor.domain.Pessoa;
import br.com.restaurante.castor.repositories.ExamplePessoaRepository;
import br.com.restaurante.castor.services.ExampleService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DefaultExampleService implements ExampleService
{
    private final ExamplePessoaRepository examplePessoaRepository;
    private final ExamplePessoaDao examplePessoaDao;

    public DefaultExampleService(ExamplePessoaRepository examplePessoaRepository, ExamplePessoaDao examplePessoaDao)
    {
        this.examplePessoaRepository = examplePessoaRepository;
        this.examplePessoaDao = examplePessoaDao;
    }

    @Override
    public List<Pessoa> searchPessoaByName(String name) {

        if(StringUtils.isBlank(name)) {
            return examplePessoaRepository.findAll();
        }

        return examplePessoaDao.searchPessoaByName(name);
    }

    @Override
    public Pessoa findByName(String name) {
        Optional<Pessoa> optionalPessoa = examplePessoaRepository.findByName(name);
        return optionalPessoa.orElse(null);
    }
}
