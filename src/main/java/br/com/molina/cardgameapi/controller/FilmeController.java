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

import br.com.molina.cardgameapi.model.Filme;
import br.com.molina.cardgameapi.repository.FilmeRepository;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/filme")
public class FilmeController {

	@Autowired
	private FilmeRepository filmeRepository;
	
	@GetMapping
	public List<Filme> buscarTodosFilme() {
		return filmeRepository.findAll();
	}
	
	@GetMapping("/buscarPorTitle")
	public Filme buscarPorTitle(@PathVariable String title) {
		return filmeRepository.findByTitle(title);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Filme> buscar(@PathVariable Long id) {
		return filmeRepository.findById(id)
				.map(filme -> ResponseEntity.ok(filme))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Filme adicionar(@RequestBody Filme filme) {
		return filmeRepository.save(filme);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Filme> atualizar(@PathVariable Long id, @RequestBody Filme filme) {
		if(!filmeRepository.existsById(id)) {
			return ResponseEntity.notFound().build();
		}
		filme.setId(id);
		filmeRepository.save(filme);
		return ResponseEntity.ok(filme);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Filme> apagar(@PathVariable Long id) {
		if(!filmeRepository.existsById(id)) {
			return ResponseEntity.notFound().build();
		}
		filmeRepository.deleteById(id);
		return ResponseEntity.noContent().build();
	}
}
