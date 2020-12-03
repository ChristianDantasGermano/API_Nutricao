package br.com.api.nutricao.repository;

import br.com.api.nutricao.calculo.IMC;
import br.com.api.nutricao.calculo.IMG;

public class CalculosRepository {
	public IMC imc;
	public IMG img;
	public double resultadoIMC = 0;
	public double resultadoIMG = 0;
	
	public void salvarIMC(IMC obj) {
		resultadoIMC = obj.calcularIMC();
		imc = obj;
	}
	
	public void salvarIMG(IMG obj) {
		resultadoIMG = obj.calcularIMG(resultadoIMC);
		img = obj;
	}

}
