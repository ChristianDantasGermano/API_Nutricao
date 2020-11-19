package br.com.api.nutricao.calculo;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class IMG {
	protected IMC imc;
	protected int idade;
	protected int sexo;
	@Getter protected double valor;

	public double calcularIMG() {
		this.valor = (1.20 * imc.getValor()) + (0.23 * idade) - (10.8 * sexo) - 5.4;
		return valor;
	}
}
