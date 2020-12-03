
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
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import br.com.api.nutricao.modelo.alimentos.TabelaNutricional;
import lombok.Getter;
import lombok.Setter;

@SuppressWarnings("serial")
@Inheritance(strategy = InheritanceType.JOINED)
@Entity
public class Receitas implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Getter protected long id;
	
	@Column()
	@Getter @Setter protected String nome;
	@Column()
	@Getter @Setter protected String ComoPreparar;
	@Column()
	@Getter @Setter protected double TempoPreparo;

	
	@OneToMany(orphanRemoval = true,cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "idReiceita")
	@Getter @Setter protected List<Ingrediente> ingredientes = new ArrayList<Ingrediente>();
	
	@OneToOne(orphanRemoval = true,cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "idNutricional")
	@Getter @Setter private TabelaNutricional tabelaNutricional;
	
}

