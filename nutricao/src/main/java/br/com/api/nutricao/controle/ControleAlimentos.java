package br.com.api.nutricao.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.api.nutricao.modelo.alimentos.Alimentos;
import br.com.api.nutricao.modelo.alimentos.TabelaNutricional;
import br.com.api.nutricao.modelo.container.AlimentosContainer;
import br.com.api.nutricao.repository.AlimentosRepository;

@Controller
public class ControleAlimentos {
	@Autowired
	private AlimentosRepository alimentos;
	
	@RequestMapping(value="/addalimento",method = RequestMethod.POST)
	public String cadastrar(@ModelAttribute("alimentoForm") AlimentosContainer alimento,
			Alimentos alimenta,TabelaNutricional nutri) {
		System.out.println(alimento);
		System.out.println(alimento.getMinerios());
		System.out.println(alimento.getVitaminas());
		nutri.setMinerios(alimento.getMinerios());
		nutri.setVitaminas(alimento.getVitaminas());
		alimenta.setTabelaNutricional(nutri);
		alimentos.save(alimenta);
		return "redirect:/alimentos";
	}
	
	
}
