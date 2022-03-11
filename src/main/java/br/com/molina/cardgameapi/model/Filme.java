package br.com.molina.cardgameapi.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_filme")
public class Filme implements Comparable<Filme>{
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    @Column(name = "title")
    private String title;
    
    @Column(name = "year")
    private long year;
    
    @Column(name = "rated")
    private String rated;
    
    @Column(name = "runtime")
    private String runtime;
    
    @Column(name = "genre")
    private String genre;
    
    @Column(name = "director")
    private String director;
    
    @Column(name = "writer")
    private String writer;
    
    @Column(name = "actors")
    private String actors;
    
    @Column(name = "plot")
    private String plot;
    
    @Column(name = "language")
    private String language;
    
    @Column(name = "country")
    private String country;
    
    @Column(name = "awards")
    private String awards;
    
    @Column(name = "poster")
    private String poster;
    
    @Column(name = "metascore")
    private String metascore;
    
    @Column(name = "imdbrating")
    private String imdbrating;
    
    @Column(name = "imdbvotes")
    private String imdbvotes;
    
    @Column(name = "imdbid")
    private String imdbid;
    
    @Column(name = "type")
    private String type;
    
    @Column(name = "boxoffice")
    private String boxoffice;
    
    @Column(name = "production")
    private String production;
    
    @Column(name = "website")
    private String website;
    
    @Column(name = "response")
    private long response;
    
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public long getYear() {
		return year;
	}

	public void setYear(long year) {
		this.year = year;
	}

	public String getRated() {
		return rated;
	}

	public void setRated(String rated) {
		this.rated = rated;
	}

	public String getRuntime() {
		return runtime;
	}

	public void setRuntime(String runtime) {
		this.runtime = runtime;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getActors() {
		return actors;
	}

	public void setActors(String actors) {
		this.actors = actors;
	}

	public String getPlot() {
		return plot;
	}

	public void setPlot(String plot) {
		this.plot = plot;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getAwards() {
		return awards;
	}

	public void setAwards(String awards) {
		this.awards = awards;
	}

	public String getPoster() {
		return poster;
	}

	public void setPoster(String poster) {
		this.poster = poster;
	}

	public String getMetascore() {
		return metascore;
	}

	public void setMetascore(String metascore) {
		this.metascore = metascore;
	}

	public String getImdbrating() {
		return imdbrating;
	}

	public void setImdbrating(String imdbrating) {
		this.imdbrating = imdbrating;
	}

	public String getImdbvotes() {
		return imdbvotes;
	}

	public void setImdbvotes(String imdbvotes) {
		this.imdbvotes = imdbvotes;
	}

	public String getImdbid() {
		return imdbid;
	}

	public void setImdbid(String imdbid) {
		this.imdbid = imdbid;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getBoxoffice() {
		return boxoffice;
	}

	public void setBoxoffice(String boxoffice) {
		this.boxoffice = boxoffice;
	}

	public String getProduction() {
		return production;
	}

	public void setProduction(String production) {
		this.production = production;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public long getResponse() {
		return response;
	}

	public void setResponse(long response) {
		this.response = response;
	}

	@Override
	public int compareTo(Filme o) {
		if (this.id > o.getId()) {
			return -1;
		}
		if (this.id < o.getId()) {
			return 1;
		}
		return 0;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Filme other = (Filme) obj;
		return id == other.id && Objects.equals(title, other.title);
	}
	
	
}
