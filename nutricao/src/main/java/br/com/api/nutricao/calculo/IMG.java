package br.com.api.nutricao.calculo;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor

@SuppressWarnings("serial")

public class IMG implements Serializable{
	@Getter @Setter protected int idade;
	@Getter @Setter protected int sexo;

	public double calcularIMG(double imc) {
		 return (1.20 * imc) + (0.23 * idade) - (10.8 * sexo) - 5.4;
	}
}
