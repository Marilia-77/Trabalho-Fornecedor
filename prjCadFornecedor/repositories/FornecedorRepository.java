package com.marilia.prjCadFornecedor.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marilia.prjCadFornecedor.entities.Fornecedor;


public interface FornecedorRepository extends JpaRepository<Fornecedor, Long>{
	
List<Fornecedor> findByRazaoSocialContaining(String razaoSocial);
List<Fornecedor> findByNomeFantasiaContaining(String nomeFantasia);
List<Fornecedor> findByCnpjContaining(String cnpj);
List<Fornecedor> findByEndereçoContaining(String endereço);
List<Fornecedor> findByFoneContaining(String fone);
List<Fornecedor> findByinscriçãoEstatualContaining(String inscriçãoEstatual);

}

