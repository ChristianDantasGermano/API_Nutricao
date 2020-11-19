package br.com.api.nutricao.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.api.nutricao.modelo.alimentos.Alimentos;
import br.com.api.nutricao.repository.AlimentosRepository;

@Controller
public class ControleAlimentos {
	@Autowired
	private AlimentosRepository alimentos;
	
	@RequestMapping(value="/cadastrar",method = RequestMethod.POST)
	public String cadastrar(Alimentos at) {
		alimentos.save(at);
		return "redirect:/";
	}
}
