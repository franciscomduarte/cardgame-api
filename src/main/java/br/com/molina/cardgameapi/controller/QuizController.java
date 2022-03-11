package br.com.molina.cardgameapi.controller;

import java.util.Iterator;
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

import br.com.molina.cardgameapi.model.Quiz;
import br.com.molina.cardgameapi.model.Ranking;
import br.com.molina.cardgameapi.model.User;
import br.com.molina.cardgameapi.repository.QuizRepository;
import br.com.molina.cardgameapi.repository.UserRepository;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/quiz")
public class QuizController {

	@Autowired
	private QuizRepository quizRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping
	public List<Quiz> buscarTodosQuiz() {
		return quizRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Quiz> buscar(@PathVariable Long id) {
		return quizRepository.findById(id)
				.map(quiz -> ResponseEntity.ok(quiz))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Quiz adicionar(@RequestBody Quiz quiz) {
		return quizRepository.save(quiz);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Quiz> atualizar(@PathVariable Long id, @RequestBody String dados) {
		if(!quizRepository.existsById(id)) {
			return ResponseEntity.notFound().build();
		}
		
		Quiz quiz = quizRepository.getById(id);
		ObjectMapper mapper = new ObjectMapper();
        String usuario = "";
		try {
			JsonNode node = mapper.readTree(dados);
            usuario = node.get("usuario").asText();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		
		User user = userRepository.findByUserName(usuario);
		quiz.getUsers().add(user);
		quizRepository.save(quiz);
		return ResponseEntity.ok(quiz);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Quiz> apagar(@PathVariable Long id) {
		if(!quizRepository.existsById(id)) {
			return ResponseEntity.notFound().build();
		}
		quizRepository.deleteById(id);
		return ResponseEntity.noContent().build();
	}
}
