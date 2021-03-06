package com.hunters.api.model.input;

import javax.validation.constraints.NotBlank;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class ProdutosUsuarioInput {
	
	
	@ApiModelProperty(example = "A", required = true)
	@NotBlank
	private String status;
	
	@ApiModelProperty(example = "Id Usuario e Id Produto", required = true)
	@NotBlank
	private PrudutosUsuarioPkInput pk;

}
