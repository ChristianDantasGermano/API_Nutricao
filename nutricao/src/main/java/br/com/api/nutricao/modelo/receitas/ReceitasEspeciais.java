package br.com.api.nutricao.modelo.receitas;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@SuppressWarnings("serial")
@Entity
public class ReceitasEspeciais extends Receitas {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Getter private long id;
	
	@Column
	@Getter @Setter protected String efeitoEspecial;
}
