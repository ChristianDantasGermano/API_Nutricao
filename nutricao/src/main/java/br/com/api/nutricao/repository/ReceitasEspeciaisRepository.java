package br.com.api.nutricao.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.api.nutricao.modelo.receitas.ReceitasEspeciais;

public interface ReceitasEspeciaisRepository extends CrudRepository<ReceitasEspeciais,String> {
	public ReceitasEspeciais findById(long id);
}
