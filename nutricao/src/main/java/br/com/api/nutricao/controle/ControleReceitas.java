package br.com.api.nutricao.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.api.nutricao.modelo.alimentos.Alimentos;
import br.com.api.nutricao.modelo.container.ReceitasContainer;
import br.com.api.nutricao.modelo.receitas.Receitas;
import br.com.api.nutricao.repository.AlimentosRepository;
import br.com.api.nutricao.repository.ReceitasRepository;

@Controller
public class ControleReceitas {
	@Autowired
	private ReceitasRepository receitas;
	@Autowired
	private AlimentosRepository alimentos;
	
	@RequestMapping(value="/addReceita",method = RequestMethod.POST)
	public String cadastrar(@ModelAttribute("receitasForm") ReceitasContainer container,
			Receitas receita) {
		System.out.println(container);
		receita.setIngredientes(container.getIngredientes());
		//receitas.save(receita);
		return "redirect:/receitas";
	};
	
	@RequestMapping("/receitas")
	public ModelAndView Receitas(){
		Iterable<Receitas> elementosR = receitas.findAll();
		//Receitas receita = receitas.findById(elementosR.iterator().next().getId());;
		ModelAndView mv = new ModelAndView();
		mv.setViewName("receitas");
		//mv.addObject("receitasElemento",elementosR);
		//mv.addObject("receita",receita);
		Iterable<Alimentos> elementosA = alimentos.findAll();
		mv.addObject("elementos",elementosA);
		return mv;
	};
	
	
	@RequestMapping(value="/receitas/{id}",method = RequestMethod.GET)
	public ModelAndView ConsultarReceitas(@PathVariable long id) {
		Iterable<Receitas> elementos = receitas.findAll();
		Alimentos alimento = alimentos.findById(id);;
		ModelAndView mv = new ModelAndView();
		mv.setViewName("receitas");
		mv.addObject("elementos",elementos);
		mv.addObject("alimentos",alimento);
		return mv;
	};

}