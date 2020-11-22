package com.clientes.apirestclientes.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;


@Entity
@Table(name="TB_CLIENTE")
public class Cliente implements Serializable{
	
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@JoinColumn(name="id")
	private Long id;
	
	@Size(min = 3, max = 100)
	
	@Column(name="nome")
	private String nome;

	@Column(name="cpf")
	private String cpf;
	
	@Column(name="bairro")
	private String bairro;
	
	@Column(name="cep")
	private String cep;
	
	@Column(name="cidade")
	private String cidade;
	
	@Column(name="complemento")
	private String complemento;
	
	@Column(name="logradouro")
	private String logradouro;
	
	@Column(name="uf")
	private String uf;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@Column(name="cod_contato")
	private List<Contato> telefones;
	
	@Column(name="cod_email")
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Email> emails;
	

	public Cliente(){
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public List<Contato> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<Contato> telefones) {
		this.telefones = telefones;
	}

	public List<Email> getEmails() {
		return emails;
	}

	public void setEmails(List<Email> emails) {
		this.emails = emails;
	}

}
