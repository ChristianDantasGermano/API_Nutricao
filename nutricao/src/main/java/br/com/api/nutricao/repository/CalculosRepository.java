package br.com.api.nutricao.repository;

import java.util.ArrayList;
import java.util.List;

import br.com.api.nutricao.calculo.IMC;
import lombok.Getter;
import lombok.Setter;

public class CalculosRepository {
	private @Getter @Setter List<IMC> imc = new ArrayList<IMC>();
	private IMC obj;
	
	public void salvarIMC(IMC valor) {
		obj.calcularIMC();
		imc.add(obj);
		System.out.println(imc);
	}
}
