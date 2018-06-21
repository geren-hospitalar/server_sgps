package br.com.sgps.serverSgps.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.sgps.serverSgps.models.MarcarConsultas;
import br.com.sgps.serverSgps.repositories.MarcarConsultasRepository;

@RestController
@RequestMapping(path = "/api/consultas")
public class MarcarConsultasResource {
	
	@Autowired
	private MarcarConsultasRepository marcarConsultasRepository;
	
	@CrossOrigin(origins = "*")
	@GetMapping(produces = "application/json")
	public @ResponseBody List<MarcarConsultas> findAllConsultas(){		
		List<MarcarConsultas> consultas = marcarConsultasRepository.findAll();
		return consultas;
	}
	
	@CrossOrigin(origins = "*")
	@PostMapping(consumes = "application/json")
	public @ResponseBody MarcarConsultas marcarConsulta(@RequestBody MarcarConsultas marcarConsultas){
		MarcarConsultas maConsultas =marcarConsultasRepository.save(marcarConsultas);
		return maConsultas;
	}
	
	
	@CrossOrigin(origins = "*")
	@DeleteMapping(path="/{idConsulta}")
	public ResponseEntity<Void> deleteConsulta(@PathVariable("idConsulta") Integer idConsulta){
			marcarConsultasRepository.deleteById(idConsulta);
		return ResponseEntity.noContent().build();
	}
	
	

}
