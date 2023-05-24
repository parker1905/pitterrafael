package br.com.academy.service;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.academy.datasource.model.Pessoa;
import br.com.academy.exception.PessoaResourceException;
import br.com.academy.repository.PessoaRepository;
import br.com.academy.resource.model.PessoaResource;

@Service
public class CadastroPessoaServiceImpl {

  private static final Logger LOG = Logger.getLogger(CadastroPessoaServiceImpl.class);

  @Autowired
  private PessoaRepository pessoaRepository;

  @Autowired
  private PessoaConversor service;

  public void cadastro(PessoaResource pessoaResource) {

    try {
      Pessoa pessoa = service.conversor(pessoaResource);
      pessoaRepository.saveAndFlush(pessoa);
    } catch (PessoaResourceException e) {
      LOG.error("Erro ao salvar a pessoa: " + e.getMessage(), e);
    }
  }

}
