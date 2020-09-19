package com.evalsba.springboot.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.evalsba.springboot.model.Usuario;
import com.evalsba.springboot.web.dto.UsuarioRegistrationDto;

public interface UsuarioService extends UserDetailsService{
	Usuario save(UsuarioRegistrationDto registrationDto);
}
