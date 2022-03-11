package br.com.molina.cardgameapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.molina.cardgameapi.model.Quiz;

@Repository
public interface QuizRepository extends JpaRepository<Quiz, Long>{
	
}
