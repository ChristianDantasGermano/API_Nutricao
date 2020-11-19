package br.com.api.nutricao.modelo.alimentos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor @Getter @Setter
public class Alimentos {
	private String nome;
	private GrupoAlimentos grupoAlimentos;
	private TabelaNutricional tabelaNutricional;
}
