package com.clientes.apirestclientes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clientes.apirestclientes.models.Contato;

public interface ContatoRepository extends JpaRepository<Contato, Long> {

}
