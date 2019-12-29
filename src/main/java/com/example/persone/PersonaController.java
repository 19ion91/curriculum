package com.example.persone;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.personaRepo.PersonaRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class PersonaController{
	
	@Autowired
	private PersonaRepo personaRepo;
	@GetMapping("/home")
	public String showPage(Model model, @RequestParam(defaultValue = "0") int page) {		
		model.addAttribute("data", personaRepo.findAll().get(0));
//		model.addAttribute("currentPage", page);
		return "home";
	}
	@PostMapping("/save")
	public String save(Persona persona) {
		personaRepo.save(persona);
		return "redirect:/home";
	}
	@PostMapping("/delete")
	public String deletePersona(Persona persona) {
		personaRepo.delete(persona);
		return "redirect:/home";
	}
	@GetMapping("/save")
	@ResponseBody
	public Persona findOne(String nome) {
		return personaRepo.findAll().get(0);
	}
}
