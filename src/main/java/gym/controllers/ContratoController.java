package gym.controllers;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


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
	private ContratoRepository _rep;
	
	@PersistenceContext
	  private EntityManager em;
	

	@GetMapping(path="/save") 
	public @ResponseBody String agregarContrato (@RequestParam Integer idUsuario
			, @RequestParam String fecha,@RequestParam Integer membresia,@RequestParam Integer sucursal) {

		ContratoPk pk = new ContratoPk(idUsuario,fecha);
		Contrato n = new Contrato(pk);
		
		n.setIdMembresia(membresia);
		n.setIdSucursal(sucursal);

		_rep.save(n);
		return "el usuario ha sido guardado";
	}
	
	@GetMapping(path="/find-all")
	public @ResponseBody Iterable<Contrato> getAll() {
		
		return _rep.findAll();
	}
	
	@GetMapping(path="/find-by-sucursal")
	public @ResponseBody Iterable<Contrato> getBySucursal(@RequestParam Integer idSucursal) {
		  
		return _rep.findByIdSucursal(idSucursal);
	}
}
