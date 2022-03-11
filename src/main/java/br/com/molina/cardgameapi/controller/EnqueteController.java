package br.com.molina.cardgameapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.molina.cardgameapi.model.Enquete;
import br.com.molina.cardgameapi.model.Filme;
import br.com.molina.cardgameapi.model.Quiz;
import br.com.molina.cardgameapi.repository.EnqueteRepository;
import br.com.molina.cardgameapi.repository.FilmeRepository;
import br.com.molina.cardgameapi.repository.QuizRepository;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/enquete")
public class EnqueteController {

	@Autowired
	private EnqueteRepository enqueteRepository;
	
	@Autowired
	private FilmeRepository filmeRepository;
	
	@Autowired
	private QuizRepository quizRepository;
	
	@GetMapping
	public List<Enquete> buscarTodosEnquete() {
		return enqueteRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Enquete> buscar(@PathVariable Long id) {
		return enqueteRepository.findById(id)
				.map(enquete -> ResponseEntity.ok(enquete))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Enquete adicionar(@RequestBody String dados) {
		Enquete enquete = new Enquete();
		ObjectMapper mapper = new ObjectMapper();
		String filme1 = "";
        String filme2 = "";
        String idQuiz = "";
		try {
			JsonNode node = mapper.readTree(dados);
			filme1 = node.get("filme1").asText();
            filme2 = node.get("filme2").asText();
            idQuiz = node.get("id").asText();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		Filme objFilme1 = filmeRepository.findByTitle(filme1);
		Filme objFilme2 = filmeRepository.findByTitle(filme2);
		
		Quiz quiz = quizRepository.findById(Long.valueOf(idQuiz)).get();
		
		enquete.getFilmes().add(objFilme1);
		enquete.getFilmes().add(objFilme2);
		enquete.setQuiz(quiz);
		enquete.setRespondida(false);
		
		return enqueteRepository.save(enquete);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Enquete> atualizar(@PathVariable Long id, @RequestBody String idFilme) {
		if(!enqueteRepository.existsById(id)) {
			return ResponseEntity.notFound().build();
		}
		
		ObjectMapper mapper = new ObjectMapper();
		String idFilmePass = "";
		try {
			JsonNode node = mapper.readTree(idFilme);
			idFilmePass = node.get("idFilme").asText();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		
		Enquete enquete = enqueteRepository.findById(id).get();
		Filme filmeVencedor = filmeRepository.findById(Long.valueOf(idFilmePass)).get();
		enquete.setFilmeVencedor(filmeVencedor);
		enquete.setRespondida(true);
		enqueteRepository.save(enquete);
		return ResponseEntity.ok(enquete);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Enquete> apagar(@PathVariable Long id) {
		if(!enqueteRepository.existsById(id)) {
			return ResponseEntity.notFound().build();
		}
		enqueteRepository.deleteById(id);
		return ResponseEntity.noContent().build();
	}
}
