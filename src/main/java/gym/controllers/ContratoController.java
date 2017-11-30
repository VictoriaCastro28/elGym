package gym.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import gym.models.Contrato;
import gym.models.pks.ContratoPk;
import gym.repositories.ContratoRepository;

@Controller   
@RequestMapping(path="/contrato") 
public class ContratoController {
	@Autowired 
	private ContratoRepository contratoRepository;
	
	@GetMapping(path="/save") 
	public @ResponseBody String agregarContrato (@RequestParam Integer idUsuario
			, @RequestParam String fecha,@RequestParam Integer membresia,@RequestParam Integer sucursal) {

		ContratoPk pk = new ContratoPk(idUsuario,fecha);
		Contrato n = new Contrato(pk);
		
		n.setIdMembresia(membresia);
		n.setIdSucursal(sucursal);

		contratoRepository.save(n);
		return "el usuario ha sido guardado";
	}
	
	@GetMapping(path="/find-all")
	public @ResponseBody Iterable<Contrato> getAllContratos() {
		// This returns a JSON or XML with the users
		return contratoRepository.findAll();
	}
}
