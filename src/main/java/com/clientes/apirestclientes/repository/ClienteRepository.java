package com.clientes.apirestclientes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clientes.apirestclientes.models.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
	
	Cliente findById(long id);
	
}
