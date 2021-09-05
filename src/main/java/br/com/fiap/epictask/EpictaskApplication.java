package br.com.fiap.epictask;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableCaching
@EnableSwagger2
public class EpictaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(EpictaskApplication.class, args);
	}

}