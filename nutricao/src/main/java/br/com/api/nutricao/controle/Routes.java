package br.com.api.nutricao.controle;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Routes {

	//Página Home
	@RequestMapping("/")
	public String home() {
		return "home";
	}
	
	//
	@RequestMapping("/alimentos")
	public String Alimentos() {
		return "alimentos";
	}
	
}

