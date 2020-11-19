package br.com.api.nutricao.calculo;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class IMC {
	protected double peso = 2;
	protected double altura = 3;
	@Getter protected double valor;

	public double calcularIMC() {
		this.valor = peso / (altura * altura);
		return valor;
	}
}
