package br.com.molina.cardgameapi.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_quiz")
public class Quiz {
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
    
    @Column(name = "nome", nullable = false)
	private String nome;
    
    @ManyToMany
    @JoinTable(name="quiz_has_users", joinColumns=
    {@JoinColumn(name="quiz_id")}, inverseJoinColumns=
      {@JoinColumn(name="user_id")})
    private List<User> users = new ArrayList<>();

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}
	
}
