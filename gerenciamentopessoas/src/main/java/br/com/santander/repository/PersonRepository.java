package br.com.santander.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.santander.model.PessoaModel;

public interface PersonRepository extends JpaRepository<PessoaModel, Long>{
	

}
