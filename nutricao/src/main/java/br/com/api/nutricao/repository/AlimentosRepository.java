package br.com.api.nutricao.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.api.nutricao.modelo.alimentos.Alimentos;

public interface AlimentosRepository extends CrudRepository<Alimentos,String>{

}
