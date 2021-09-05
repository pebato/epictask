package br.com.fiap.epictask.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.epictask.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
