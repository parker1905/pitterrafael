package br.com.academy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.academy.datasource.model.Pessoa;
import br.com.academy.exception.PessoaNotFoundException;
import br.com.academy.resource.model.PessoaResource;
import br.com.academy.service.BuscarPessoaPorIdServiceImpl;
import br.com.academy.service.BuscarPessoaServiceImpl;
import br.com.academy.service.CadastroPessoaServiceImpl;

@RestController
@RequestMapping(value = "/api")
public class AcademiaController {

  @Autowired
  private BuscarPessoaServiceImpl serviceBuscar;

  @Autowired
  private CadastroPessoaServiceImpl serviceCadastro;

  @Autowired
  private BuscarPessoaPorIdServiceImpl serviceBuscarPorCodigo;

  @GetMapping(path = "/pessoa")
  public List<Pessoa> buscarPessoa() {
    return serviceBuscar.buscarTodosAsPessoa();
  }

  @GetMapping(path = "/pessoa/codigo/{codigo}")
  public Pessoa buscarPessoaPorCodigo(
      @PathVariable(name = "codigo", required = true) Long codigo) throws PessoaNotFoundException {
    return serviceBuscarPorCodigo.buscarPorCodigo(codigo);
  }

  @PostMapping(path = "/nutricionista/save")
  public void salvarPessoa(@RequestBody PessoaResource pessoa) {
    serviceCadastro.cadastro(pessoa);
  }

  @DeleteMapping(path = "/pessoa/delete/{codigo}")
  public void deletePessoa(@PathVariable(name = "codigo", required = true) Long codigo)
      throws PessoaNotFoundException {
    serviceBuscarPorCodigo.deletarPorCodigo(codigo);
  }

}
