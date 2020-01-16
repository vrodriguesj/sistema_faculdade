package entitites;

import java.util.List;

public class Calculadora {

	public double somaSalario(List<Pessoa> pessoa) { 
		double soma = 0;
		for (Pessoa p : pessoa) {
			soma += p.getSalario();
		}
		return soma;
	}
	
	public double maiorSalario(List<Pessoa> pessoa) {
		double maiorSalario = 0;
		for (Pessoa p : pessoa) {
			if (maiorSalario < p.getSalario())
				maiorSalario = p.getSalario();
		}
		return maiorSalario;
	}
}
