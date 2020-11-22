package br.com.api.nutricao.controle;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.api.nutricao.calculo.IMC;
import br.com.api.nutricao.repository.CalculosRepository;

@Controller
public class ControleCalculos {
	
	private CalculosRepository calr;
	
	@RequestMapping(value = "/calculo", method = RequestMethod.POST)
	public String calculo(IMC peso, IMC altura, IMC valor) {
		calr.salvarIMC(valor);
		return "redirect:/calculos";
	}

}
