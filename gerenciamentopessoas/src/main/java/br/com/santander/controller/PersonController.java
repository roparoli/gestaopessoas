package br.com.santander.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.santander.dto.MessageResponseDTO;
import br.com.santander.model.PessoaModel;
import br.com.santander.repository.PersonRepository;

@RestController
@RequestMapping("/api/v1/people")
public class PersonController {
	
	private PersonRepository personRepository;

	@Autowired
	public PersonController(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}
	
	@PostMapping
	public MessageResponseDTO createPerson(@RequestBody PessoaModel pessoa) {
		PessoaModel savedPerson = personRepository.save(pessoa);
		return MessageResponseDTO
				.message("Created person with ID " + savedPerson.)
				.build;
	}
	
}
