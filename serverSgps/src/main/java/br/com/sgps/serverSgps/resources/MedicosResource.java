package br.com.sgps.serverSgps.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import br.com.sgps.serverSgps.models.Medicos;
import br.com.sgps.serverSgps.repositories.MedicoRepository;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(path = "/api/medicos")
public class MedicosResource {
	
	@Autowired
	private MedicoRepository medicoRepository;
	
	@ApiOperation(value="Retorna tudos os Medicos")
	@CrossOrigin(origins = "*")
	@GetMapping(produces = "application/json")	
	public @ResponseBody List<Medicos> listMedicos(){
		return medicoRepository.findAll();
	}
	
	@CrossOrigin(origins = "*")
	@GetMapping(path="/{idHospitais}", produces = "application/json")
	public @ResponseBody List<Medicos> listMedicosByHospital(@PathVariable Integer idHospitais){		
		List<Medicos> medicos = medicoRepository.findAllByIdHospitais(idHospitais);
		return medicos;
	}

}
