package br.com.restaurante.castor.daos.impl;

import br.com.restaurante.castor.daos.ExamplePessoaDao;
import br.com.restaurante.castor.domain.Pessoa;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DefaultExamplePessoaDao implements ExamplePessoaDao
{
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Pessoa> searchPessoaByName(String name)
    {
        return entityManager.createQuery("SELECT p FROM Pessoa p WHERE LOWER(p.name) LIKE :name", Pessoa.class).setParameter("name", "%" + name.toLowerCase() + "%").getResultList();
    }
}
