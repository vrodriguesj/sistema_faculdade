package main;

import java.util.ArrayList;
import java.util.List;

import entitites.Calculadora;
import entitites.Pessoa;

public class Main {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		Calculadora calculadora = new Calculadora();
		
		List<Pessoa> listPessoa = new ArrayList<Pessoa>();
		
		listPessoa.add(new Pessoa("Vinicius", 27, 1000));
		listPessoa.add(new Pessoa("Tim", 25, 50));
		listPessoa.add(new Pessoa("Isabelle", 24, 1200));
		
			
		System.out.println("Soma Salário " + calculadora.somaSalario(listPessoa));
		System.out.println("Maior Salário " + calculadora.maiorSalario(listPessoa));
	}
}
