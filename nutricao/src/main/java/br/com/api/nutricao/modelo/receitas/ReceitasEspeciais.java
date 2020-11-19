package br.com.api.nutricao.modelo.receitas;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor @AllArgsConstructor
public class ReceitasEspeciais extends Receitas {
	@Getter @Setter protected String efeitoEspecial;
}
