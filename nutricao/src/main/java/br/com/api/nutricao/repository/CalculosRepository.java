package br.com.api.nutricao.repository;

import java.util.ArrayList;
import java.util.List;

import br.com.api.nutricao.calculo.IMC;
import lombok.Getter;
import lombok.Setter;

public class CalculosRepository {
	public IMC imc;
	public double resultadoIMC;
	
	public void salvarIMC(IMC obj) {
		System.out.println("calr: " + obj);
		resultadoIMC = obj.calcularIMC();
		imc = obj;
		System.out.println(resultadoIMC);
	}
}
