package br.com.api.nutricao.modelo.container;

import java.util.List;

import br.com.api.nutricao.modelo.alimentos.Minerais;
import br.com.api.nutricao.modelo.alimentos.Vitaminas;
import br.com.api.nutricao.modelo.receitas.Ingrediente;

public class ReceitasContainer {
	private List<Ingrediente> ingredientes;
	private List<Minerais> minerios;
	private List<Vitaminas> vitaminas;

	public List<Vitaminas> getVitaminas() {
		return vitaminas;
	}

	public void setVitaminas(List<Vitaminas> vitaminas) {
		this.vitaminas = vitaminas;
	}
	
	public List<Minerais> getMinerios() {
		return minerios;
	}

	public void setMinerios(List<Minerais> minerios) {
		this.minerios = minerios;
	}
	public List<Ingrediente> getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(List<Ingrediente> ingrediente) {
		this.ingredientes = ingrediente;
	}
}
