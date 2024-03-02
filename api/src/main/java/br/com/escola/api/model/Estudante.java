package br.com.escola.api.model;

import java.util.UUID;

public class Estudante {
	private final String id;
	private String nome;
	



	public String getId() {
		return id;
	}


	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public Estudante(String id, String nome) {
		this.id = id;
		this.nome = nome;
	}


	public Estudante(String nome) {
		this(UUID.randomUUID().toString(), nome);
	}


}
