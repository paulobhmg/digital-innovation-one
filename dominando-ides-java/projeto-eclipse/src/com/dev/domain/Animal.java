package com.dev.domain;

import java.util.Objects;

public class Animal {

	private String nome;
	private String idade;

	public Animal() {
	}

	public Animal(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Animal [nome=" + nome + ", idade=" + idade + "]";
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || obj.getClass() != getClass())
			return false;
		Animal animal = (Animal) obj;
		return nome.equalsIgnoreCase(animal.nome);
	}

	public int hashCode() {
		return Objects.hash(nome);
	}
}
