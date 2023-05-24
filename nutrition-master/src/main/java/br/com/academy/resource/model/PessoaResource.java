package br.com.academy.resource.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PessoaResource implements Serializable {

  private static final long serialVersionUID = 6030862910379069667L;

  @JsonProperty("nome_nutricionista")
  private String nome;

  @JsonProperty("cpf")
  private String cpf;

  @JsonProperty("email")
  private String email;
  
  //get e set
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  @Override
  public String toString() {
    return "PessoaResource [nome=" + nome + ", cpf-" + cpf + ", email="
        + email + "]";
  }

}
