package br.com.api.nutricao.modelo.alimentos;

import java.io.Serializable;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MapKeyColumn;

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
	@ElementCollection
	@MapKeyColumn(name="nomeMineral")
	@Column(name="quantidade")
    private Map<String, Double> outrosMinerais;
	@ElementCollection
	@MapKeyColumn(name="nomeVitaminas")
	@Column(name="quantidade")
    private Map<String, Double> vitaminas;
}
