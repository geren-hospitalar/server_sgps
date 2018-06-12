package br.com.sgps.serverSgps.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.sgps.serverSgps.models.MarcarConsultas;
import br.com.sgps.serverSgps.repositories.MarcarConsultasRepository;

@RestController
@RequestMapping(path = "/api/consultas")
public class MarcarConsultasService {
	
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
	public ResponseEntity<Void> marcarConsulta(@RequestBody MarcarConsultas marcarConsultas){
		marcarConsultasRepository.save(marcarConsultas);
		return ResponseEntity.ok().build();
	}
	
	

}
