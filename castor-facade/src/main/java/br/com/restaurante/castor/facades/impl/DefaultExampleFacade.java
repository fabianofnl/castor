package br.com.restaurante.castor.facades.impl;

import br.com.restaurante.castor.domain.Pessoa;
import br.com.restaurante.castor.dtos.PessoaDTO;
import br.com.restaurante.castor.facades.ExampleFacade;
import br.com.restaurante.castor.mappers.PessoaMapper;
import br.com.restaurante.castor.services.ExampleService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultExampleFacade implements ExampleFacade
{
    private final ExampleService exampleService;
    private final PessoaMapper pessoaMapper;

    public DefaultExampleFacade(ExampleService exampleService, PessoaMapper pessoaMapper)
    {
        this.exampleService = exampleService;
        this.pessoaMapper = pessoaMapper;
    }

    @Override
    public List<PessoaDTO> searchPessoaByName(String name) {
        List<Pessoa> pessoas = exampleService.searchPessoaByName(name);
        return pessoaMapper.pessoasToDTOList(pessoas);
    }

    @Override
    public PessoaDTO findByName(String name) {
        Pessoa pessoa = exampleService.findByName(name);
        return pessoaMapper.pessoaToDTO(pessoa);
    }
}
