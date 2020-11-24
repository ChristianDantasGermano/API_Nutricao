package br.com.api.nutricao.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.api.nutricao.modelo.alimentos.Alimentos;
import br.com.api.nutricao.modelo.alimentos.TabelaNutricional;
import br.com.api.nutricao.modelo.container.AlimentosContainer;

@Controller
public class ControleAlimentos {
	@Autowired
	private br.com.api.nutricao.repository.AlimentosRepository alimentos;
	
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
	
	@RequestMapping("/alimentos")
	public ModelAndView Alimentos() {
		Iterable<Alimentos> elementos = alimentos.findAll();
		Alimentos alimento = alimentos.findById(elementos.iterator().next().getId());
		ModelAndView mv = new ModelAndView();
		mv.setViewName("alimentos");
		mv.addObject("elementos",elementos);
		mv.addObject("alimentos",alimento);
		return mv;
	}
	
	@RequestMapping(value="/alimentos/{id}",method = RequestMethod.GET)
	public ModelAndView ConsultarNutricao(@PathVariable long id) {
		Iterable<Alimentos> elementos = alimentos.findAll();
		Alimentos alimento = alimentos.findById(id);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("alimentos");
		mv.addObject("elementos",elementos);
		mv.addObject("alimentos",alimento);
		return mv;
	}
	
}
