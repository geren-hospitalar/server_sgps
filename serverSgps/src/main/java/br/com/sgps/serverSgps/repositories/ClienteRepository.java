package br.com.sgps.serverSgps.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.sgps.serverSgps.models.Clientes;

@Repository
public interface ClienteRepository extends JpaRepository<Clientes, Integer>{	

}
