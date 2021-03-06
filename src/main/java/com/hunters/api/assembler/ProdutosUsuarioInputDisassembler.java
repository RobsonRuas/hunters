package com.hunters.api.assembler;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hunters.api.domain.entity.ProdutosUsuario;
import com.hunters.api.model.input.ProdutosUsuarioInput;

@Component
public class ProdutosUsuarioInputDisassembler {

	@Autowired
	private ModelMapper modelMapper;
	
	public ProdutosUsuario toDomainObject(ProdutosUsuarioInput produtosUsuarioInput) {
		return modelMapper.map(produtosUsuarioInput, ProdutosUsuario.class);
	}
	
	public void copyToDomainObject(ProdutosUsuarioInput produtosUsuarioInput, ProdutosUsuario produtoUsuario) {
		modelMapper.map(produtosUsuarioInput, produtoUsuario);
	}
	
}
