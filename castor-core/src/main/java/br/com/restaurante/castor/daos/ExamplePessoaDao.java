package br.com.restaurante.castor.daos;

import br.com.restaurante.castor.domain.Pessoa;

import java.util.List;

public interface ExamplePessoaDao
{
    List<Pessoa> searchPessoaByName(String nome);
}
