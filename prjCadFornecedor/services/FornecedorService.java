package com.marilia.prjCadFornecedor.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marilia.prjCadFornecedor.entities.Fornecedor;
import com.marilia.prjCadFornecedor.repositories.FornecedorRepository;

@Service
public class FornecedorService {
	private final FornecedorRepository fornecedorRepository;
	
	@Autowired
	public FornecedorService(FornecedorRepository fornecedorRepository) {
		this.fornecedorRepository = fornecedorRepository;
		
	}
	public Fornecedor salvarFornecedor (Fornecedor fornecedor) {
		return fornecedorRepository.save(fornecedor);
		
	}
	public Fornecedor getFornecedorById(Long Id) {
		return fornecedorRepository.findById(Id).orElse(null);
	}
	public List<Fornecedor> getAllProdutos() {
		return fornecedorRepository.findAll();
	}

	public void deletarFornecedor(Long Id) {
		fornecedorRepository.deleteById(Id);
	}
	public Fornecedor updateFornecedor(Long id, Fornecedor fornecedorAtualizado) {
		Optional<Fornecedor> fornecedorOptional = fornecedorRepository.findById(id);
		if (fornecedorOptional.isPresent()) {
			Fornecedor fornecedor = fornecedorOptional.get();
			fornecedor.setRazaoSocial(fornecedorAtualizado.getRazaoSocial());
			fornecedor.setNomeFantasia(fornecedorAtualizado.getNomeFantasia());
			fornecedor.setCnpj(fornecedorAtualizado.getCnpj());
			fornecedor.setEndereço(fornecedorAtualizado.getEndereço());
			fornecedor.setFone(fornecedorAtualizado.getFone());		fornecedor.setEmail(fornecedorAtualizado.getEmail());
            fornecedor.setInscriçãoEstatual(fornecedorAtualizado.getInscriçãoEstatual());
			return fornecedorRepository.save(fornecedor);
			
		}else {
			return null;
			
		}
	}
	public List<Fornecedor> buscaPorRazao(String razaoSocial){
		return fornecedorRepository.findByRazaoSocialContaining(razaoSocial);
	}
	
	public List<Fornecedor> buscaPorNomeFantasia(String nomeFantasia){
		return fornecedorRepository.findByNomeFantasiaContaining(nomeFantasia);
	}
	public List<Fornecedor> buscaPorCnpj(String cnpj){
		return fornecedorRepository.findByCnpjContaining(cnpj);
	}
	public List<Fornecedor> buscaPorEndereço(String endereço){
		return fornecedorRepository.findByEndereçoContaining(endereço);
	}
	public List<Fornecedor> buscaPorFone(String fone){
		return fornecedorRepository.findByFoneContaining(fone);
	}
	public List<Fornecedor> buscaPorInscricaoEstatual(String inscriçãoEstatual){
		return fornecedorRepository.findByinscriçãoEstatualContaining(inscriçãoEstatual);
	}
}
