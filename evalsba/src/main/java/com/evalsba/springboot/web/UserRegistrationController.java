package com.evalsba.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.evalsba.springboot.service.UsuarioService;
import com.evalsba.springboot.web.dto.UsuarioRegistrationDto;

@Controller
@RequestMapping("/registro")
public class UserRegistrationController {

	private UsuarioService usuarioService;

	public UserRegistrationController(UsuarioService usuarioService) {
		super();
		this.usuarioService = usuarioService;
	}
	
	@ModelAttribute("usuario")
    public UsuarioRegistrationDto userRegistrationDto() {
        return new UsuarioRegistrationDto();
    }
	
	@GetMapping
	public String showRegistrationForm() {
		return "registro";
	}
	
	@PostMapping
	public String registerUserAccount(@ModelAttribute("usuario") UsuarioRegistrationDto registrationDto) {
		usuarioService.save(registrationDto);
		return "redirect:/registro?success";
	}
}
