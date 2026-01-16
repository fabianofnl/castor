package br.com.restaurante.castor.mappers;

import br.com.restaurante.castor.domain.Pessoa;
import br.com.restaurante.castor.dtos.PessoaDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PessoaMapper
{
    PessoaDTO pessoaToDTO(Pessoa pessoa);

    List<PessoaDTO> pessoasToDTOList(List<Pessoa> pessoas);
}
