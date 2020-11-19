package br.com.api.nutricao.modelo.alimentos;

import java.util.HashMap;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor @Getter @Setter
public class TabelaNutricional {
	private float valorEnergetico;
	private float carboidratos;
	private float proteinas;
	private float gordurasTotais;
	private float gordurasSaturadas;
	private float gordurasTrans;
	private float fibraAlimentar;
	private float sodio;
	private Map<String,Double> outrosMinerais = new HashMap<String, Double>();
	private Map<String, Double> vitaminas = new HashMap<String, Double>();
}
