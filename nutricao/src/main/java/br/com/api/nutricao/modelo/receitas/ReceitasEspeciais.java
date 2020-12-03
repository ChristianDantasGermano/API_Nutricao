package br.com.api.nutricao.modelo.receitas;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

import lombok.Getter;
import lombok.Setter;

@SuppressWarnings("serial")
@PrimaryKeyJoinColumn(name = "idReceita")
@Entity
public class ReceitasEspeciais extends Receitas implements Serializable {
	@Column
	@Getter @Setter private String efeitoEspecial;
}
