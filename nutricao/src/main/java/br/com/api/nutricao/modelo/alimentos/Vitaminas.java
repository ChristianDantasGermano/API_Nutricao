package br.com.api.nutricao.modelo.alimentos;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@SuppressWarnings("serial")
@Entity @AllArgsConstructor @NoArgsConstructor 
public class Vitaminas implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Getter private long id;
	
	@Column()
	@Getter @Setter private String nomeVitamina;
	@Column()
	@Getter @Setter private Double quantidade;
	
}
