package br.com.academy.datasource.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pessoa")
public class Pessoa implements Serializable {

  private static final long serialVersionUID = 3862024889868951158L;
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private short codigo;

    
  private String nome;
  private String cpf;
  private String email;

  public short getCodigo() {
      return codigo;
  }

  public void setCodigo(short codigo) {
      this.codigo = codigo;
  }

  public String getNome() {
      return nome;
  }

  public void setNome(String nome) {
      this.nome = nome;
  }

  public String getCpf() {
      return cpf;
  }

  public void setCpf(String cpf) {
      this.cpf = cpf;
  }

  public String getEmail() {
      return email;
  }

  public void setEmail(String email) {
      this.email = email;
  }

}
