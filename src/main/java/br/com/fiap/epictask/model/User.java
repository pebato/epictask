package br.com.fiap.epictask.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
@Entity
public class User {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "Email inválido")
	private String email;
	
	@NotBlank(message = "Nome obrigatório")
	private String name;
	
	@Size(min=8, message = "Senha deve ter pelo menos 8 caracteres.")
	private String password;
	
}
