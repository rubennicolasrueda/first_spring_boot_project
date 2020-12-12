package com.chanceIT.cliente_project.repository;

import com.chanceIT.cliente_project.entities.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {
    Iterable<Cliente> findByOrderByIdDesc();
}
