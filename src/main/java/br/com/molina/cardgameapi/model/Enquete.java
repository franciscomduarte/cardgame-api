package br.com.molina.cardgameapi.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_enquete")
public class Enquete {
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
    @ManyToMany
    @JoinTable(name="enquete_has_filmes", joinColumns=
    {@JoinColumn(name="enquete_id")}, inverseJoinColumns=
      {@JoinColumn(name="filme_id")})
    private List<Filme> filmes = new ArrayList<>();
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "quiz_id")
    private Quiz quiz;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "filme_id")
    private Filme filmeVencedor;
    
    @Column(name = "respondida")
    private boolean respondida;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public List<Filme> getFilmes() {
		return filmes;
	}
	public void setFilmes(List<Filme> filmes) {
		this.filmes = filmes;
	}
	public Quiz getQuiz() {
		return quiz;
	}
	public void setQuiz(Quiz quiz) {
		this.quiz = quiz;
	}
	public Filme getFilmeVencedor() {
		return filmeVencedor;
	}
	public void setFilmeVencedor(Filme filmeVencedor) {
		this.filmeVencedor = filmeVencedor;
	}
	public boolean isRespondida() {
		return respondida;
	}
	public void setRespondida(boolean respondida) {
		this.respondida = respondida;
	}
	@Override
	public int hashCode() {
		return Objects.hash(filmes);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Enquete other = (Enquete) obj;
		return Objects.equals(filmes, other.filmes);
	}
	
}
