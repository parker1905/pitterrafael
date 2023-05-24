package br.com.academy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.academy.datasource.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
