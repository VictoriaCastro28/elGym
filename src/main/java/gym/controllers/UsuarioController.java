package gym.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import gym.models.Usuario;
import gym.repositories.UsuarioRepository;

@Controller   
@RequestMapping(path="/usuario") 
public class UsuarioController {
	
	@Autowired 
	private UsuarioRepository _rep;
	
	@GetMapping(path="/save") 
	public @ResponseBody String agregarUsuario (@RequestParam String nombre
			, @RequestParam String apellido, @RequestParam String correo) {
		// @ResponseBody means the returned String is the response, not a view name
		// @RequestParam means it is a parameter from the GET or POST request
		
		 if (_rep.findByNombre(nombre) != null) {
				return "Ya existe un usuario con ese nombre";
			}
		
		Usuario n = new Usuario();
		n.setNombre(nombre);
		n.setApellido(apellido);
		n.setCorreo(correo);
		_rep.save(n);
		return "Saved";
	}
	
	@GetMapping(path="/find-all")
	public @ResponseBody Iterable<Usuario> getAllUsers() {
		// This returns a JSON or XML with the users
		return _rep.findAll();
	}
}
