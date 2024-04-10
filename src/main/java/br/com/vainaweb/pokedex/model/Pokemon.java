package br.com.vainaweb.pokedex.model;

import java.util.ArrayList;
import java.util.List;


public class Pokemon {

    private Long id;
    private String nome;
    private String tipo;
    private List<String> poderes;
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public List<String> getPoderes() {
		return poderes;
	}
	public void setPoderes(List<String> poderes) {
		this.poderes = poderes;
	}

    // Getters e setters
    
    
}