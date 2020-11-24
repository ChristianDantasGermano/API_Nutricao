package br.com.api.nutricao.modelo.container;

import java.util.List;

import br.com.api.nutricao.modelo.alimentos.Minerais;
import br.com.api.nutricao.modelo.alimentos.Vitaminas;

public class AlimentosContainer {
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
}
