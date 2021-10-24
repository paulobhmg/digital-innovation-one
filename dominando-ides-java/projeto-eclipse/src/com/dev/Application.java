package com.dev;

import com.dev.domain.Animal;

public class Application {
	public static void main(String[] args) {
		Animal cachorro = new Animal("Cachorro");
		Animal gato = new Animal("Gato");
		Animal aleatorio = new Animal("gato");
		
		System.out.println(gato.equals(cachorro));
		System.out.println(aleatorio.equals(gato));
	}
}
