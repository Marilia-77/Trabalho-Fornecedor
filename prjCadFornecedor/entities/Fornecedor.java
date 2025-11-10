package com.marilia.prjCadFornecedor.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "tbFornecedor")
public class Fornecedor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	private String razaoSocial;
	private String nomeFantasia;
	private String cnpj;
	private String endereço;
	private String fone;
	private String email;
	private String inscriçãoEstatual;
	
	public Fornecedor () {
		
	}
	public Fornecedor(Long Id,String razaoSocial , String nomeFantasia , String cnpj , String endereço, String fone, String email, String inscriçãoEstatual) {
		this.Id=Id;
		this.razaoSocial=razaoSocial;
		this.nomeFantasia=nomeFantasia;
		this.cnpj=cnpj;
		this.endereço=endereço;
		this.fone=fone;
		this.email=email;
		this.inscriçãoEstatual=inscriçãoEstatual;
	}
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getEndereço() {
		return endereço;
	}
	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getInscriçãoEstatual() {
		return inscriçãoEstatual;
	}
	public void setInscriçãoEstatual(String inscriçãoEstatual) {
		this.inscriçãoEstatual = inscriçãoEstatual;
	}
	
	
}
