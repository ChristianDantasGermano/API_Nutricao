
package br.com.api.nutricao.modelo.receitas;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@SuppressWarnings("serial")
@Entity
public class Receitas implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Getter private long id;
	
	@Column()
	@Getter @Setter protected String nome;
	@Column()
	@Getter @Setter protected String ComoPreparar;
	@Column()
	@Getter @Setter protected double TempoPreparo;	
	
	@OneToMany(orphanRemoval = true,cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "Ingredientes")
	@Getter @Setter private List<Ingrediente> ingredientes = new ArrayList<Ingrediente>();
	
	
}

