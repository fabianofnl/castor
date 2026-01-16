package br.com.restaurante.castor.services;

import br.com.restaurante.castor.domain.Pessoa;

import java.util.List;

public interface ExampleService
{
    List<Pessoa> searchPessoaByName(String nome);

    Pessoa findByName(String nome);
}
