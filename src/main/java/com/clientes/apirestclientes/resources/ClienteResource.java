package com.clientes.apirestclientes.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clientes.apirestclientes.models.Cliente;
import com.clientes.apirestclientes.models.Contato;
import com.clientes.apirestclientes.models.Email;
import com.clientes.apirestclientes.repository.ClienteRepository;
import com.clientes.apirestclientes.repository.ContatoRepository;
import com.clientes.apirestclientes.repository.EmailRepository;

@CrossOrigin("*")
@RestController
@RequestMapping(value="/api")
public class ClienteResource {
	
	@Autowired
	ClienteRepository clienteRepository;

	@Autowired
	ContatoRepository contatoRepository;
	
	@Autowired
	EmailRepository emailRepository;
	
	@GetMapping("/clientes")
	public List<Cliente> listaClientes(){  
		return clienteRepository.findAll();
	}
	
	@GetMapping("/cliente/{id}")
	public Cliente clienteById(@PathVariable(value="id") long id) {
		return clienteRepository.findById(id);
	}
	
	@PostMapping("/cliente")
	public Cliente salvaCliente(@RequestBody Cliente cliente) {
		for (Contato contato : cliente.getTelefones()) {
			contato.setCliente(cliente);
		}
		for (Email email : cliente.getEmails()) {
			email.setCliente(cliente);
		}
		return clienteRepository.save(cliente);
	}
		
	@DeleteMapping("/cliente/{id}")
	public void deletaCliente(@PathVariable(value="id") long id) {
		clienteRepository.deleteById(id);
	}
	
	@PutMapping("/cliente")
	public Cliente atualizaProduto(@RequestBody Cliente cliente) {
		return clienteRepository.save(cliente);
	}
}
