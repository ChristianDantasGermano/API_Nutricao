package br.com.api.nutricao.calculo;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class IMG {
	protected int idade;
	protected int sexo;
	@Getter protected double valor;

	public double calcularIMG(double imc) {
		this.valor = (1.20 * imc) + (0.23 * idade) - (10.8 * sexo) - 5.4;
		return valor;
	}
}
