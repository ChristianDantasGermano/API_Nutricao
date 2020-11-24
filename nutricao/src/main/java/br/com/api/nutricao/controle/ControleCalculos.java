package br.com.api.nutricao.controle;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.api.nutricao.calculo.IMC;
import br.com.api.nutricao.calculo.IMG;
import br.com.api.nutricao.repository.CalculosRepository;

@Controller
public class ControleCalculos {
	
	private CalculosRepository calr = new CalculosRepository();
	
	@RequestMapping(value = "calculo", method = RequestMethod.POST)
	public String calculo(IMC obj) {
		calr.salvarIMC(obj);
		return "redirect:/calculos";
	}
	
	@RequestMapping(value="calculos")
	public ModelAndView retornarIMC() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("calculos");
		mv.addObject("resultadoIMC",calr.resultadoIMC);
		mv.addObject("resultadoIMG",calr.resultadoIMG);
		return mv;
	}
	
	@RequestMapping(value = "calculoImg", method = RequestMethod.POST)
	public String calculo_IMG(IMG obj) {
		calr.salvarIMG(obj);
		return "redirect:/calculos";
	}
	
//	@RequestMapping(value="calculos")
//	public ModelAndView retornarIMG() {
//		ModelAndView mv = new ModelAndView();
//		mv.setViewName("calculos");
//		mv.addObject("resultadoIMG",calr.resultadoIMG);
//		return mv;
//	}
	
}
