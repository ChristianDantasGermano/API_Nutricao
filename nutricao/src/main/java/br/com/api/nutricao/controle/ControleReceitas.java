package br.com.api.nutricao.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.api.nutricao.modelo.alimentos.TabelaNutricional;
import br.com.api.nutricao.modelo.container.ReceitasContainer;
import br.com.api.nutricao.modelo.receitas.Receitas;
import br.com.api.nutricao.modelo.receitas.ReceitasEspeciais;
import br.com.api.nutricao.repository.ReceitasEspeciaisRepository;
import br.com.api.nutricao.repository.ReceitasRepository;

@Controller
public class ControleReceitas {
	
	@Autowired
	private ReceitasRepository receitas;
	@Autowired
	private ReceitasEspeciaisRepository receitasEspecias;
	
	@RequestMapping(value="/addReceita",method = RequestMethod.POST)
	public String cadastrar(@ModelAttribute("receitasForm") ReceitasContainer container,
			Receitas receita,ReceitasEspeciais especial,TabelaNutricional nutri) {
		nutri.setMinerios(container.getMinerios());
		nutri.setVitaminas(container.getVitaminas());
		if(especial.getEfeitoEspecial() != "") {
			especial.setTabelaNutricional(nutri);
			receitasEspecias.save(especial);
		}
		else {
			receita.setTabelaNutricional(nutri);
			receitas.save(receita);
		}
		return "redirect:/receitas";
	};
	
	@RequestMapping("/receitas")
	public ModelAndView Receitas(){
		Iterable<Receitas> elementosR = receitas.findAll();
		Receitas receita = receitas.findById(elementosR.iterator().next().getId());
		
		ReceitasEspeciais receitaEspecial = receitasEspecias.findById(elementosR.iterator().next().getId());
		ModelAndView mv = new ModelAndView();
		mv.setViewName("receitas");
		mv.addObject("receitasElemento",elementosR);
		mv.addObject("receitasEspecias",receitaEspecial);
		mv.addObject("consulta",receita);
		return mv;
	};
	
	@RequestMapping(value="/receitas/{id}",method = RequestMethod.GET)
	public ModelAndView ConsultarReceitas(@PathVariable long id){
		Iterable<Receitas> elementosR = receitas.findAll();
		Receitas receita = receitas.findById(id);
		ReceitasEspeciais receitaEspecial = receitasEspecias.findById(id);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("receitas");
		mv.addObject("receitasEspecias",receitaEspecial);
		mv.addObject("receitasElemento",elementosR);
		mv.addObject("consulta",receita);
		return mv;
	};
}