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
import br.com.sgps.serverSgps.models.MarcarExames;
import br.com.sgps.serverSgps.repositories.MarcarExameRepository;

@RestController
@RequestMapping(path = "/api/exames")
public class MarcarExameService {
	
	@Autowired
	private MarcarExameRepository marcarExameRepository;
	
	@CrossOrigin(origins = "*")
	@GetMapping(produces = "application/json")
	public @ResponseBody List<MarcarExames> findAllExames(){		
		List<MarcarExames> exames = marcarExameRepository.findAll();
		return exames;
	}
	
	@CrossOrigin(origins = "*")
	@PostMapping(consumes = "application/json")
	public ResponseEntity<Void> marcarExames(@RequestBody MarcarExames marcarExames){
		marcarExameRepository.save(marcarExames);
		return ResponseEntity.ok().build();
	}

}
