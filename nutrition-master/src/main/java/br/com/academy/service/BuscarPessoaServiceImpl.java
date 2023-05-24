package br.com.academy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.academy.datasource.model.Pessoa;
import br.com.academy.repository.PessoaRepository;

@Service
public class BuscarPessoaServiceImpl {

  @Autowired
  private PessoaRepository pessoaRepository;

  public List<Pessoa> buscarTodosOsPessoas() {
    List<Pessoa> listPessoa = pessoaRepository.findAll();
    return listPessoa;
  }
}
