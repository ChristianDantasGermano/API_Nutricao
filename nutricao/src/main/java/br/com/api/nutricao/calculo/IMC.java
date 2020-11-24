package br.com.api.nutricao.calculo;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor

@SuppressWarnings("serial")

public class IMC implements Serializable{
	@Getter @Setter protected double peso;
	@Getter @Setter protected double altura;

	public double calcularIMC() {
		return (peso / (altura * altura));
		
	}
}
