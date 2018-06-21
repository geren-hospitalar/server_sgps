package br.com.sgps.serverSgps.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.sgps.serverSgps.models.Hospitais;
import br.com.sgps.serverSgps.models.Medicos;

@Repository
public interface MedicoRepository extends JpaRepository<Medicos, Integer> {
	@Query("SELECT m FROM Medicos m "			
			+ "WHERE "
			+ "m.hospitais.hospId =:idHosp")
	List<Medicos> findAllByIdHospitais(@Param("idHosp") Integer idHosp);

}
