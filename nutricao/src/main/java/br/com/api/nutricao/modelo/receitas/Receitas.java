package br.com.api.nutricao.modelo.receitas;

import java.util.HashMap;
import java.util.Map;

import br.com.api.nutricao.modelo.alimentos.Alimentos;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Receitas {
	protected String nome;
	private Map<Alimentos, Integer> ingredientes = new HashMap<Alimentos, Integer>();
	protected String ComoPreparar;
	protected double TempoPreparo;
	protected String Observacao;	
}
