package br.com.sgps.serverSgps.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.sgps.serverSgps.models.Hospitais;
import br.com.sgps.serverSgps.repositories.HospitaisRepository;

@RestController
@RequestMapping(path = "/api/hospitais")
public class HospitaisResource {
	
	@Autowired
	private HospitaisRepository hospitaisRepository;
	
	@CrossOrigin(origins = "*")
	@GetMapping(produces = "application/json")
	public @ResponseBody List<Hospitais> findAllHospitais(){		
		List<Hospitais> hospitais = hospitaisRepository.findAll();
		return hospitais;
	}
	
	@CrossOrigin(origins = "*")
	@PostMapping(consumes = "application/json", produces = "application/json")
	public @ResponseBody Hospitais insertHospitais(@RequestBody Hospitais hospitais){		
		Hospitais hospitaisNew = hospitaisRepository.save(hospitais);		
		return hospitaisNew;
	}
	
	@CrossOrigin(origins = "*")
	@PutMapping(consumes = "application/json")
	public @ResponseBody Hospitais updateHospitais(@RequestBody Hospitais hospitais){		
		Hospitais hospitais2 =hospitaisRepository.save(hospitais);		
		return hospitais2;
	}

}
