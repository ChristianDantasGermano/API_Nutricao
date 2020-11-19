package br.com.api.nutricao.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.api.nutricao.modelo.alimentos.TabelaNutricional;

public interface TabelaNutricionalRepository extends CrudRepository<TabelaNutricional,String>{

}
