package br.com.api.nutricao.modelo.alimentos;

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
@Entity @Getter @Setter
public class TabelaNutricional implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Getter private long id;
	
	@Column()
	@Getter @Setter private float valorEnergetico;
	
	@Column()
	@Getter @Setter private float carboidratos;
	
	@Column()
	@Getter @Setter private float proteinas;
	
	@Column()
	@Getter @Setter private float gordurasSaturadas;
	
	@Column()
	@Getter @Setter private float gordurasTrans;
	
	@Column()
	@Getter @Setter private float fibraAlimentar;
	
	@Column()
	@Getter @Setter private float sodio;
	
	@OneToMany(orphanRemoval = true,cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "idTabelaNutricional")
	@Getter @Setter private List<Minerais> minerios = new ArrayList<Minerais>();
	
	@OneToMany(orphanRemoval = true,cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "idTabelaNutricional")
	@Getter @Setter private List<Vitaminas> vitaminas = new ArrayList<Vitaminas>();
}
