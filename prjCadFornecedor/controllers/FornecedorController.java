package com.marilia.prjCadFornecedor.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marilia.prjCadFornecedor.entities.Fornecedor;
import com.marilia.prjCadFornecedor.services.FornecedorService;


@RestController
@RequestMapping("/fornecedor")
public class FornecedorController {
	private final FornecedorService fornecedorService;
	
	@Autowired
	public FornecedorController(FornecedorService fornecedorService) {
		this.fornecedorService = fornecedorService;		
	}
	@PostMapping
	public Fornecedor criarFornecedor(@RequestBody Fornecedor fornecedor) {
		return fornecedorService.salvarFornecedor(fornecedor);
	}
	@GetMapping("/{id}")
	public Fornecedor buscarFornecedorPorId(@PathVariable Long Id) {
		return fornecedorService.getFornecedorById(Id);
	}
	@GetMapping
	public List<Fornecedor> listarTodosFornecedores(){
		return fornecedorService.getAllProdutos();
	}
	@DeleteMapping("/{id}")
	public void deletarFornecedores(@PathVariable Long Id) {
		fornecedorService.deletarFornecedor(Id);
	}
	@PutMapping("/{id}")
	public ResponseEntity <Fornecedor> atualizaFornecedor(@PathVariable Long id, @RequestBody Fornecedor fornecedor){
		Fornecedor atualizado = fornecedorService.updateFornecedor(id, fornecedor);
		if(atualizado != null) {
			return ResponseEntity.ok(atualizado);
		}else {
			return ResponseEntity.notFound().build();
		}
	}
	@GetMapping("/razaoSocial/{razaoSocial}")
	public List<Fornecedor> buscaPorRazaoSocilIgnoreCase(@PathVariable String razaoSocial){
		return fornecedorService.buscaPorRazao(razaoSocial);
}
	@GetMapping("/nomeFantasia/{nomeFantasia}")
	public List<Fornecedor> buscaPorNomeFantasia(@PathVariable String nomeFantasia){
		return fornecedorService.buscaPorNomeFantasia(nomeFantasia);
}	
	@GetMapping("/cnpj/{cnpj}")
	public List<Fornecedor> buscaPorCnpj(@PathVariable String cnpj){
		return fornecedorService.buscaPorCnpj(cnpj);
	}
	@GetMapping("/endereço/{endereço}")
	public List<Fornecedor> buscaPorEndereço(@PathVariable String endereço){
		return fornecedorService.buscaPorEndereço(endereço);
	}
	@GetMapping("/fone/{fone}")
	public List<Fornecedor> buscaPorFone(@PathVariable String fone){
		return fornecedorService.buscaPorFone(fone);
	}
	@GetMapping("/inscriçãoEstadual/{inscriçãoEstadual}")
	public List<Fornecedor> buscaPorInscricaoEstatual(@PathVariable String insciçãoEstadual){
		return fornecedorService.buscaPorInscricaoEstatual(insciçãoEstadual);
	}
}
