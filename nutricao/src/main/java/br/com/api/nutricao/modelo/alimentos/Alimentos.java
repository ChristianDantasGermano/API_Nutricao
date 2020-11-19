package br.com.api.nutricao.modelo.alimentos;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.Setter;

@SuppressWarnings("serial")
@Entity 
public class Alimentos implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Getter private long id;
	
	@Column()
	@Getter @Setter private String nome;
	
	@Column()
	@Getter @Setter private String grupoAlimentos;
	
	@OneToOne(orphanRemoval = true,cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "idNutricional")
	@Getter @Setter private TabelaNutricional tabelaNutricional;
}
