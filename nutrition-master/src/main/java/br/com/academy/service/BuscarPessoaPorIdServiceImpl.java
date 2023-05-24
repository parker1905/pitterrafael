package br.com.academy.service;

import java.nio.charset.CodingErrorAction;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.academy.datasource.model.Pessoa;
import br.com.academy.exception.PessoaNotFoundException;
import br.com.academy.repository.PessoaRepository;

@Service
public class BuscarPessoaPorIdServiceImpl {

  @Autowired
  private PessoaRepository pessoaRepository;

  public Pessoa buscarPorCodigo(Long codigo) throws PessoaNotFoundException {
    Optional<Pessoa> optionalPessoa = getOptional(codigo);
    Pessoa pessoa = null;
    if (!optionalPessoa.isPresent()) {
      throw new PessoaNotFoundException("Nutricionista nao encontrado atraves do ID: " + id);
    } else {
      pessoa = optionalPessoa.get();
    }
    return pessoa;
  }

  private Optional<Pessoa> getOptional(Long codigo) {
    Optional<Pessoa> optionalPessoa = pessoaRepository.findById(codigo);
    return optionalPessoa;
  }

  public void deletarPorId(Long id) throws PessoaNotFoundException {
    Optional<Pessoa> optionalPessoa = getOptional(id);
    if (!optionalPessoa.isPresent()) {
      throw new PessoaNotFoundException("Pessoa nao encontrado atraves do Codigo: " + codigo);
    } else {
      pessoaRepository.delete(optionalPessoa.get());
    }

  }

}
