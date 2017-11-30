package gym.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
	

	@GetMapping(value = "/")
	  public String index() {
	      return "/home";
	  }

	@GetMapping(value = "/home")
	  public String home() {
	      return "/home";
	  }
	
	@GetMapping(value = "/loginDePrueba")
	  public String login() {
	      return "/loginDePrueba";
	  }
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	  public String autentificar() {
	      return "/loginDePrueba";
	  }
	
	@GetMapping(value = "/registrar")
	  public String registrar() {
	      return "/registrar";
	  }
  
	
	@GetMapping(value = "/saludo")
	  public String main() {			
	      return "/saludo";
	  }

}
