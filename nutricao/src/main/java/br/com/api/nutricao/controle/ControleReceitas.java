package br.com.api.nutricao.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.api.nutricao.modelo.container.ReceitasContainer;
import br.com.api.nutricao.modelo.receitas.Receitas;
import br.com.api.nutricao.repository.ReceitasRepository;

@Controller
public class ControleReceitas {
	@Autowired
	private ReceitasRepository receitas;
	
	@RequestMapping(value="/addReceita",method = RequestMethod.POST)
	public String cadastrar(@ModelAttribute("receitasForm") ReceitasContainer container,
			Receitas receita) {
		System.out.println(container);
		
		
		
		
		
		//receitas.save(at);
		return "redirect:/receitas";
	}

}

