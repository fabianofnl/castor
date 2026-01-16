package br.com.restaurante.castor.repositories;

import br.com.restaurante.castor.domain.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ExamplePessoaRepository extends JpaRepository<Pessoa, Integer>
{
    Optional<Pessoa> findByName(String name);
}
