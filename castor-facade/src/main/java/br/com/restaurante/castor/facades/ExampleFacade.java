package br.com.restaurante.castor.facades;

import br.com.restaurante.castor.dtos.PessoaDTO;

import java.util.List;

public interface ExampleFacade
{
    List<PessoaDTO> searchPessoaByName(String name);

    PessoaDTO findByName(String name);
}
