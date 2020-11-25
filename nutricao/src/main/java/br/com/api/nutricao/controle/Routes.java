package br.com.api.nutricao.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.api.nutricao.modelo.alimentos.Alimentos;
import br.com.api.nutricao.modelo.receitas.Receitas;
import br.com.api.nutricao.repository.AlimentosRepository;
import br.com.api.nutricao.repository.ReceitasRepository;

@Controller
public class Routes {
	
	@Autowired
	private AlimentosRepository alimentos;
	private ReceitasRepository receitas;
	
	//Página Home
	@RequestMapping("/")
	public String home() {
		return "home";
	}
	
	//
	
	
}

