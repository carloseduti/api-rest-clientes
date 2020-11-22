package com.clientes.apirestclientes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clientes.apirestclientes.models.Email;

public interface EmailRepository  extends JpaRepository<Email, Long>{

}
