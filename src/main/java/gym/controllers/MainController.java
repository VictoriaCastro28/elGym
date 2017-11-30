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
	
	@GetMapping(value = "/login")
	  public String login() {
	      return "/login";
	  }
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	  public String autentificar() {
	      return "/main";
	  }
	
	@GetMapping(value = "/registrar")
	  public String registrar() {
	      return "/registrar";
	  }
  
	
	@GetMapping(value = "/main")
	  public String main() {			
	      return "/main";
	  }

}
