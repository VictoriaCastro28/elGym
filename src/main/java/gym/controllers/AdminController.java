package gym.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import gym.models.Admin;
import gym.repositories.AdminRepository;

@Controller   
@RequestMapping(path="/admin") 
public class AdminController {
	
	@Autowired 
	private AdminRepository _rep;
	
	@GetMapping(path="/save") 
	public @ResponseBody String agregarUsuario (@RequestParam String nombre
			, @RequestParam String apellido, @RequestParam String correo, @RequestParam String clave) {

		 if (_rep.findByNombre(nombre) != null) {
				return "Ya existe un usuario con ese nombre";
			}
		
		Admin n = new Admin();
		n.setNombre(nombre);
		n.setApellido(apellido);
		n.setClave(clave);
		n.setCorreo(correo);
		_rep.save(n);
		return "Admin guardado";
	}
	
	@GetMapping(path="/find-all")
	public @ResponseBody Iterable<Admin> getAllUsers() {
		// This returns a JSON or XML with the users
		return _rep.findAll();
	}
}
