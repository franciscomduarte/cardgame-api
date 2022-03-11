package br.com.molina.cardgameapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.molina.cardgameapi.model.Filme;

//@Repository
public interface FilmeRepository extends JpaRepository<Filme, Long>{
	
	Filme findByTitle(String title);
	
}
