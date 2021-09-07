package com.devsuperior.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devsuperior.domain.entities.Client;
import com.devsuperior.domain.repositories.ClientRepository;

@SpringBootApplication
public class AulaDomainApplication implements CommandLineRunner{
	
	@Autowired
	private ClientRepository clientRepository;

	public static void main(String[] args) {
		SpringApplication.run(AulaDomainApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Client c1 = new Client(null, "Alex Green", "alex@gmail.com");
		
		clientRepository.save(c1);
		
	}
	
}
