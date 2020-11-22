package br.com.api.nutricao.modelo.container;

import java.util.List;
import br.com.api.nutricao.modelo.receitas.Ingrediente;

public class ReceitasContainer {
	private List<Ingrediente> ingredientes;

	public List<Ingrediente> getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(List<Ingrediente> ingrediente) {
		this.ingredientes = ingrediente;
	}
}
