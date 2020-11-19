package br.com.api.nutricao.modelo.receitas;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.com.api.nutricao.modelo.alimentos.Alimentos;
import lombok.Getter;
import lombok.Setter;

@SuppressWarnings("serial")
@Entity
public class Receitas {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Getter private long id;
	
	@Column
	@Getter @Setter protected String nome;
	@Getter @Setter private Map<Alimentos, Integer> ingredientes = new HashMap<Alimentos, Integer>();
	@Getter @Setter protected String ComoPreparar;
	@Getter @Setter protected double TempoPreparo;
	@Getter @Setter protected String Observacao;	
}
