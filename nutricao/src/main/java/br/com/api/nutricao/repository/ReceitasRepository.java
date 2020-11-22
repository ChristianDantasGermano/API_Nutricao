package br.com.api.nutricao.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.api.nutricao.modelo.receitas.Receitas;

public interface ReceitasRepository extends CrudRepository<Receitas,String> {

}
