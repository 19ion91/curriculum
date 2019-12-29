package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import  com.example.persone.*;
import com.example.personaRepo.PersonaRepo;

@SpringBootApplication
public class CurriculumApplication implements CommandLineRunner{
	@Autowired
	private PersonaRepo personaRepo;

	public static void main(String[] args) {
		SpringApplication.run(CurriculumApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception{
		Persona p = new Persona("Ion","Sirbu");
		System.out.println("curriculumApplication "+p.getName());
		personaRepo.save(p);
		
	}
}
